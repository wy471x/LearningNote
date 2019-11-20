package InputOutput;
import java.io.*;
public class PrintStreamAndPrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringWriter buffer = new StringWriter();
        try(PrintWriter pw = new PrintWriter(buffer)){
        	pw.println("Hello");
        	pw.println(12345);
        	pw.println(true);
        }
        System.out.println(buffer.toString());
	}

}
