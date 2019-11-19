package InputOutput;
import java.io.*;
public class UseInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        byte[] data = {72,101,108,108,111,33};
        try(InputStream input = new ByteArrayInputStream(data)){
        	int n;
        	while((n = input.read()) != -1) {
        		System.out.println((char)n);
        	}
        }
        
        String s;
        try(InputStream input = new FileInputStream("C:\\test\\README.txt")){
        	 s = readAsString(input);
        }
        System.out.println(s);
	}
    public static String readAsString(InputStream input) throws IOException{
    	int n;
    	StringBuilder sb = new StringBuilder();
    	while((n = input.read()) != -1) {
    		 sb.append((char) n );
    	}
    	return sb.toString();
    }
}
