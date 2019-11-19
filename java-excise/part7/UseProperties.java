package Collection;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class UseProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String settings = "# test" + "\n" + "course=Java" + "\n" + 
		     "last_open_date=2019-08-07T12:35:01" + "\n" + "last_open_file=XXX.txt";
        ByteArrayInputStream input = new ByteArrayInputStream(settings.getBytes("UTF-8"));
        Properties props = new Properties();
        props.load(input);
        
        System.out.println("course: " + props.getProperty("course"));
        System.out.println("last_open_date: " + props.getProperty("last_open_date"));
        System.out.println("last_open_file: " + props.getProperty("last_open_file"));
        System.out.println("auto_save: " + props.getProperty("auto_save","60"));
	    //absolute path
        String f = "D:\\Program Files\\Eclipse-workspace\\test\\src\\Collection\\setting.properties";
	    props.load(new java.io.FileInputStream(f));
	    String filepath = props.getProperty("last_open_file");
	    System.out.println("last_open_path: " + filepath);
	    String interval = props.getProperty("auto_save_interval");
	    System.out.println("auto_save_interval: " + interval);
	    
	    props.setProperty("url", "http://www.github.com");
	    props.setProperty("language", "Java");
	    props.store(new FileOutputStream("D:\\\\Program Files\\\\Eclipse-workspace\\\\test\\\\src\\\\Collection\\\\setting.properties"), "store to setting.properties");
	    
	    Properties props2 = new Properties();
	    props2.load(new FileReader("D:\\\\Program Files\\\\Eclipse-workspace\\\\test\\\\src\\\\Collection\\\\setting.properties",StandardCharsets.UTF_8));
	    System.out.println("course: " + props2.getProperty("course"));
        System.out.println("last_open_date: " + props2.getProperty("last_open_date"));
        System.out.println("last_open_file: " + props2.getProperty("last_open_file"));
        System.out.println("url: " + props2.getProperty("url"));
        System.out.println("language: " + props2.getProperty("language"));
        System.out.println("auto_save_interval: " + props2.getProperty("auto_save_interval"));
	}

}
