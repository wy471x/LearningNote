package OOP;

import java.math.BigInteger;

public class BigIntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5));
        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2);
        System.out.println(sum);
        
        
        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue());
        System.out.println(i.multiply(i).longValueExact());
        
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
      }

}
