package InputOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipFile;
import java.io.FileInputStream;

public class OperateZipInputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator + "testfolder.zip");
		File outFile = null;
		ZipFile zipFile = new ZipFile(file);
		
		ZipInputStream zipInput = null;
		OutputStream out = null;
		InputStream input = null;
		ZipEntry entry = null;
		
		zipInput = new ZipInputStream(new FileInputStream(file));
		
		while((entry = zipInput.getNextEntry())!= null) {
			System.out.println("½âÑ¹Ëõ" + entry.getName() + "ÎÄ¼þ");
			outFile = new File("D:" + File.separator + entry.getName());
			
			if(!outFile.getParentFile().exists()) {
				outFile.getParentFile().mkdir();
			}
			if(!outFile.exists()) {
				outFile.createNewFile();
			}
			input = zipFile.getInputStream(entry);
			out = new FileOutputStream(outFile);
			int temp = 0;
			while((temp = input.read()) != -1) {
				out.write(temp);
			}
			input.close();
			out.close();
		}
		input.close();
	}

}
