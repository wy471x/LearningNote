package InputOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;

public class OperateZipOutputStreamForFolder {

	public static void main(String[] args) throws Exception { // throw all exception
		// TODO Auto-generated method stub
        File file = new File("D:" + File.separator + "test"); // define file which will be compressed
        File zipFile = new File("D:" + File.separator + "testfolder.zip"); // define file name after compress
        
        InputStream input = null; // file input stream
        ZipOutputStream zipOut = null; // declare zip stream object
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.setComment("https://github.com/wy471x/"); // set comment
        int temp = 0;
        if(file.isDirectory()) {
        	File[] lists = file.listFiles();
        	for(int i = 0; i < lists.length;i++) {
        		input = new FileInputStream(lists[i]);
        		zipOut.putNextEntry(new ZipEntry(file.getName() + 
        				                         File.separator +
        				                         lists[i].getName()));
        		while((temp = input.read()) != -1) {
        			zipOut.write(temp);
        		}
        		input.close(); 
        	}
        }
        zipOut.close();
	}

}
