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
        Integer n6 = null;
        int j = n6;
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