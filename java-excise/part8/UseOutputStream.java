package InputOutput;

import java.io.*;

public class UseOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        byte[] data;
        try(ByteArrayOutputStream output = new ByteArrayOutputStream())
        {
        	output.write("Hello ".getBytes("UTF-8"));
        	output.write("World!".getBytes("UTF-8"));
        	data = output.toByteArray();
        }
        System.out.println(new String(data,"UTF-8"));
	}

}
