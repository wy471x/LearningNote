package EncodingAndSecurity;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
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
        
        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));
        
        byte[] input2 = new byte[] {(byte)0xe4,(byte)0xb8,(byte)0xb8,(byte)0xad,
        		                    (byte)0x21};
        String b64encoded2 = Base64.getEncoder().encodeToString(input2);
        System.out.println(b64encoded2.length());
        String b64encoded3 = Base64.getEncoder().withoutPadding().encodeToString(input2);
        System.out.println(b64encoded3.length());
        System.out.println(b64encoded2);
        System.out.println(b64encoded3);
        byte[] output2 = Base64.getDecoder().decode(b64encoded3);
        System.out.println(Arrays.toString(output2));
        
        
        byte[] input3 = new byte[] {0x01,0x02,0x7f,0x00};
        String b64encoded4 = Base64.getUrlEncoder().encodeToString(input3);
        System.out.println(b64encoded4);
        byte[] output3 = Base64.getUrlDecoder().decode(b64encoded4);
        System.out.println(Arrays.toString(output));
      
        
        }

}
