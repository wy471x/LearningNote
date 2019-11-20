package InputOutput;
import java.io.*;
import java.util.Arrays;
public class JavaObjectSerializable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try( ObjectOutputStream output = new ObjectOutputStream(buffer)){
        	output.writeInt(12345);
        	
        	output.writeUTF("Hello");
        	
        	output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
	}

}
