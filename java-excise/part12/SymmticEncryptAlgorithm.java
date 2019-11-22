package EncodingAndSecurity;


import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SymmticEncryptAlgorithm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String message = "Hello,world!";
        System.out.println("Message: " + message);
        byte[] key = "1234567890abcdef".getBytes("UTF-8");
        byte[] data = message.getBytes("UTF-8");
        byte[] encrypted = encrypt(key,data);
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));
        byte[] decrypted = decrypt(key,encrypted);
        System.out.println("Decrypted: " + new String(decrypted, "UTF-8"));
     }
	 // º”√‹:
    public static byte[] encrypt(byte[] key, byte[] input) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(input);
    }

    // Ω‚√‹:
    public static byte[] decrypt(byte[] key, byte[] input) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return cipher.doFinal(input);
    }
}
