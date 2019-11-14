package OOP;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer1 n = null;
        Integer1 n2 = new Integer1(99);
        int n3 = n2.intValue();
        System.out.println(n3);
        
        int i = 100;
        Integer n1 = new Integer(i);
        Integer n4 = Integer.valueOf(i);
        Integer n5 = Integer.valueOf("100");
        System.out.println(n5.intValue());
        
        //Auto Boxing and Auto Unboxing
        //Integer n6 = null;
        //int j = n6;
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n6 = 99999;
        System.out.println("x == y: " + (x == y));
        System.out.println("m == n: " + (m == n6));
        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("m.equals(n): " + m.equals(n6));
        
        
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        int sizeOfLong = Long.SIZE;
        int bytesOfLong = Long.BYTES;
        
        System.out.println(sizeOfLong);
        System.out.println(bytesOfLong);
        
        
        Number num = new Integer(999);
        
        byte b = num.byteValue();
        System.out.println("byte: " + b);
        int n7 = num.intValue();
        System.out.println("int: " + n7);
        long ln = num.longValue();
        System.out.println("long: " + ln);
        float f2 = num.floatValue();
        System.out.println("float: " + f2);
        double d = num.doubleValue();
        System.out.println("double: " + d);
        
        byte x2 = -1;
        byte y2 = 127;
        System.out.println(Byte.toUnsignedInt(x2));
        System.out.println(Byte.toUnsignedInt(y2));
        
        //short s2 = -1;
        //System.out.println(Integer.toUnsignedInt(s2));
        int i2 = -1;
        System.out.println(Integer.toUnsignedLong(i2));
        
        
	}

}

class Integer1{
  private int value;
  
  public Integer1(int value) {
	  this.value = value;
  }
  
  public int intValue() {
	  return this.value;
  }
}