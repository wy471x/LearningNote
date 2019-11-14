package OOP;

import java.util.Arrays;
import java.util.Random;
import java.security.*;

public class UsualToolsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random r = new Random(12345);
       r.nextInt();
       System.out.println(r.nextInt());
       r.nextInt(10);
       System.out.println(r.nextInt(10));
       r.nextLong();
       System.out.println(r.nextLong());
       r.nextFloat();
       System.out.println(r.nextFloat());
       r.nextDouble();
       System.out.println(r.nextDouble());
       
       
       SecureRandom sr = null;
       try {
    	   sr = SecureRandom.getInstanceStrong();
    	   
       }catch(NoSuchAlgorithmException e){
    	   sr = new SecureRandom();
       }
       byte[] buffer = new byte[16];
       sr.nextBytes(buffer);
       System.out.println(Arrays.toString(buffer));
       
	}

}
