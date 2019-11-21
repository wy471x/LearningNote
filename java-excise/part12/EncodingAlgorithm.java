package EncodingAndSecurity;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//URL encode
        String decoded = URLDecoder.decode("%E4%B8%AD%E6%96%87%21",StandardCharsets.UTF_8);
        System.out.println(decoded);
        
        //Base64 encode
        byte[] input = new byte[] {(byte)0xe4, (byte) 0xb8, (byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);
	}

}
