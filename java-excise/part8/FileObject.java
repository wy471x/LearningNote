package InputOutput;
import java.io.*;
import java.nio.file.*;

public class FileObject {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
        //File object
		File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        
        File f2 = new File("test.txt");
        System.out.println(f2);
        
        
        File f3 = new File("C:\\Windows");
        File f4 = new File("C:\\Windows\\notepad.exe");
        File f5 = new File("C:\\Windows\\nothing");
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
        System.out.println(f4.isFile());
        System.out.println(f4.isDirectory());
        System.out.println(f5.isFile());
        System.out.println(f5.isDirectory());
        
        File f6 = File.createTempFile("tmp-", ".txt");
        f6.deleteOnExit();
        System.out.println(f6.isFile());
        System.out.println(f6.isDirectory());
        
        
        //traverse file and directory
        File f7 = new File("C:\\Windows");
        File[] fs1 = f7.listFiles();
        printFiles(fs1);
        File[] fs2 = f7.listFiles(new FilenameFilter() {
        	public boolean accept(File dir,String name) {
        		return name.endsWith(".exe");
        	}
        });
        printFiles(fs2);
        System.out.println("==============");
        //Path object
        Path p1 = Paths.get(".","project","study");
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
        Path p3 = p2.normalize();
        System.out.println(p3);
        File f8 = p3.toFile();
        System.out.println(f8);
        for(Path p : Paths.get("..").toAbsolutePath()) {
        	System.out.println(" " + p);
        }
        
        //excise 
        
	}
	static void printFiles(File[] files) {
		System.out.println("=============");
		if(files != null) {
			for(File f : files) {
				System.out.println(f);
			}
		}
	}
   
}
