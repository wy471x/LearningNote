package InputOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;

public class OperateZipOutputStreamForFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator + "test.txt");
		File zipFile = new File("D:" + File.separator + "test.zip");
		
		InputStream input = new FileInputStream(file);
		ZipOutputStream zipOut = null;
		zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		zipOut.setComment("https://github.com/wy471x/");
		int temp = 0;
		while((temp = input.read()) != -1) {
			zipOut.write(temp);
		}
		input.close();
		zipOut.close();
        
	}

}
