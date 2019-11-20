package InputOutput;

import java.nio.charset.StandardCharsets;
import java.io.*;

public class WriterOutputStreamInterface {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String path = "D:\\test.txt";
        writeToFile1(path);
        writeToFile2();
        writeToFile3();
        writeToFile4(path);
	}
	
	public static void writeToFile1(String fileName) throws IOException {
		try(Writer writer = new FileWriter(fileName,StandardCharsets.UTF_8,true)){
			writer.write("Hello");
			writer.write(",world!!!");
			writer.write("We are family.");
			writer.write("ÖÐ¹úÎäºº");
			writer.close();
		}
	}
    public static void writeToFile2() throws IOException{
    	 try(CharArrayWriter writer = new CharArrayWriter()){
    		 writer.write(65);
             writer.write(66);
             writer.write(67);
             char[] data = writer.toCharArray();
             for(char c : data) {
            	 System.out.println(c);
             }
             writer.close();
    	 }
    }
    public static void writeToFile3() throws IOException{
    	try(StringWriter writer = new StringWriter()){
    		writer.write("Hello world!");
    		String data = writer.toString();
    		System.out.println(data);
    	}
    }
    /* FileOutputStream(String fn,boolean append);  second argument If true,
     * then  then bytes will be written to the end of the file rather than 
     * the beginning 
     */
    public static void writeToFile4(String path) throws IOException{
    	try(Writer writer = new OutputStreamWriter(new FileOutputStream(path,true),"UTF-8")){
    		  writer.write("hollywood,It is very good!");
    		  writer.close();
    	}
    }
}
