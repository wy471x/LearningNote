package EncodingAndSecurity;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

public class  NonSymmetricEncryptAlgorithm{
    public static void main(String[] args) throws Exception {
        // ����:
        byte[] plain = "Hello, encrypt use RSA".getBytes("UTF-8");
        // ������Կ��˽Կ��:
        Person alice = new Person("Alice");
        // ��Alice�Ĺ�Կ����:
        byte[] pk = alice.getPublicKey();
        System.out.println(String.format("public key: %x", new BigInteger(1, pk)));
        byte[] encrypted = alice.encrypt(plain);
        System.out.println(String.format("encrypted: %x", new BigInteger(1, encrypted)));
        // ��Alice��˽Կ����:
        byte[] sk = alice.getPrivateKey();
        System.out.println(String.format("private key: %x", new BigInteger(1, sk)));
        byte[] decrypted = alice.decrypt(encrypted);
        System.out.println(new String(decrypted, "UTF-8"));
    }
}

class Person {
    String name;
    // ˽Կ:
    PrivateKey sk;
    // ��Կ:
    PublicKey pk;

    public Person(String name) throws GeneralSecurityException {
        this.name = name;
        // ���ɹ�Կ��˽Կ��:
        KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
        kpGen.initialize(1024);
        KeyPair kp = kpGen.generateKeyPair();
        this.sk = kp.getPrivate();
        this.pk = kp.getPublic();
    }

    // ��˽Կ����Ϊ�ֽ�
    public byte[] getPrivateKey() {
        return this.sk.getEncoded();
    }

    // �ѹ�Կ����Ϊ�ֽ�
    public byte[] getPublicKey() {
        return this.pk.getEncoded();
    }

    // �ù�Կ����:
    public byte[] encrypt(byte[] message) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, this.pk);
        return cipher.doFinal(message);
    }

    // ��˽Կ����:
    public byte[] decrypt(byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, this.sk);
        return cipher.doFinal(input);
    }
}
