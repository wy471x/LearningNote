package InputOutput;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderInputStreamInterface {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String path = "D:\\test.txt";
        //readFile(path);
        //readFile2(path);
        String s = "weqweqweqwdfsdfsdf";
        //readFile3(s);
        //readFile4(s);
        readFile5(path);
	}
	public static void readFile(String s) throws IOException{
		try( Reader reader = new FileReader(s,StandardCharsets.UTF_8)){
		 for(;;) {
			 int n = reader.read();
			 if( n == -1) {
				 break;
			 }
			 System.out.print((char)n);
		 }
		 reader.close();
		}
	}
	public static void readFile2(String s) throws IOException{
		 try(Reader reader = new FileReader(s,StandardCharsets.UTF_8)){
			 char[] buffer = new char[10000];
			 
			 int n;
			 
			 while((n = reader.read(buffer)) != -1) {
				 System.out.print("read " + n + " chars.");
			 }
			 reader.close();
		 }
	}
    public static void readFile3(String s) throws IOException{
    	 try(Reader reader = new CharArrayReader(s.toCharArray())) {
    		 for(;;) {
    			 int n;
    			 n = reader.read();
    			 if(n == -1) {
    				 break;
    			 }
    			 System.out.print((char)n);
    		 }
    		 reader.close();
    	 }
    }
    public static void readFile4(String s) throws IOException{
    	  try( Reader reader = new StringReader(s)){
    		  for(;;) {
    			  int n;
    			  n = reader.read();
    			  if(n == -1) {
    				  break;
    			  }
    			  System.out.print((char)n);
    		  }
    	  }
    }
    public static void readFile5(String s) throws IOException{
    	 try( Reader reader = new InputStreamReader(new FileInputStream(s),"UTF-8")){
    		    for(;;) {
    		    	int n;
    		    	n = reader.read();
    		    	if(n == -1) {
    		    		break;
    		    	}
    		    	System.out.print((char)n);
    		    }
    		    reader.close();
    	 }
    }
}
