package EncodingAndSecurity;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.*;
import javax.crypto.Cipher;

public class DigitalCertificate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    byte[] message = "Hello, use X.509 cert!".getBytes("UTF-8");
	        // ��ȡKeyStore:
	        KeyStore ks = loadKeyStore("/my2.keystore", "123456");
	        // ��ȡ˽Կ:
	        PrivateKey privateKey = (PrivateKey) ks.getKey("mycert", "123456".toCharArray());
	        // ��ȡ֤��:
	        X509Certificate certificate = (X509Certificate) ks.getCertificate("mycert");
	        // ����:
	        byte[] encrypted = encrypt(certificate, message);
	        System.out.println(String.format("encrypted: %x", new BigInteger(1, encrypted)));
	        // ����:
	        byte[] decrypted = decrypt(privateKey, encrypted);
	        System.out.println("decrypted: " + new String(decrypted, "UTF-8"));
	        // ǩ��:
	        byte[] sign = sign(privateKey, certificate, message);
	        System.out.println(String.format("signature: %x", new BigInteger(1, sign)));
	        // ��֤ǩ��:
	        boolean verified = verify(certificate, message, sign);
	        System.out.println("verify: " + verified);
	}
	 static KeyStore loadKeyStore(String keyStoreFile, String password) {
	        try (InputStream input =DigitalCertificate.class.getResourceAsStream(keyStoreFile)) {
	            if (input == null) {
	                throw new RuntimeException("file not found in classpath: " + keyStoreFile);
	            }
	            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
	            ks.load(input, password.toCharArray());
	            return ks;
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
	static byte[] encrypt(X509Certificate certificate, byte[] message) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(certificate.getPublicKey().getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, certificate.getPublicKey());
        return cipher.doFinal(message);
    }

    static byte[] decrypt(PrivateKey privateKey, byte[] data) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(privateKey.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    static byte[] sign(PrivateKey privateKey, X509Certificate certificate, byte[] message)
            throws GeneralSecurityException {
        Signature signature = Signature.getInstance(certificate.getSigAlgName());
        signature.initSign(privateKey);
        signature.update(message);
        return signature.sign();
    }

    static boolean verify(X509Certificate certificate, byte[] message, byte[] sig) throws GeneralSecurityException {
        Signature signature = Signature.getInstance(certificate.getSigAlgName());
        signature.initVerify(certificate);
        signature.update(message);
        return signature.verify(sig);
    }

}
