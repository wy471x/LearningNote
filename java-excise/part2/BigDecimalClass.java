package OOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd));
        
        //scale() method
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale());
        System.out.println(d2.scale());
        System.out.println(d3.scale());
        
        //stripTrailingZeros() method
        BigDecimal d4 = new BigDecimal("123.4500");
        BigDecimal d5 = d4.stripTrailingZeros();
        System.out.println(d4.scale());
        System.out.println(d5.scale());
        BigDecimal d6 = d3.stripTrailingZeros();
        System.out.println(d6.scale());
        
        BigDecimal d7 = new BigDecimal("123.456789");
        BigDecimal d8 = d7.setScale(4,RoundingMode.HALF_UP);
        BigDecimal d9 = d7.setScale(4,RoundingMode.DOWN);
        System.out.println(d8);
        System.out.println(d9);
        
        
        BigDecimal d10 = new BigDecimal("123.456");
        BigDecimal d11 = new BigDecimal("23.456789");
        BigDecimal d12 = d10.divide(d11,10,RoundingMode.HALF_UP);
        BigDecimal d13 = d10.divide(d11,10,RoundingMode.DOWN);
        
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]);
        System.out.println(dr[1]);
        if(dr[1].signum() == 0) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
        
        BigDecimal d14 = new BigDecimal("123.456");
        BigDecimal d15 = new BigDecimal("123.45600");
        System.out.println(d14.equals(d15));
        System.out.println(d14.equals(d15.stripTrailingZeros()));
        System.out.println(d14.compareTo(d15));
        
   
	}

}
