package InputOutput;
import java.util.*;
import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String s;
        try(InputStream input  = new FileInputStream(args[0])){
        	s = readAsString(input);
        }
        
        try(OutputStream output = new FileOutputStream(args[1])){
        	output.write(s.getBytes("UTF-8"));
        }
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
