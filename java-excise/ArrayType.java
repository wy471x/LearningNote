
public class ArrayType {
  public static void main(String[] args) {
	  int[] ns = new int[5];
	  for(int i = 0; i < ns.length;i++)
		  System.out.println(ns[i]);
	  ns[0] = 68;
	  ns[1] = 79;
	  ns[2] = 91;
	  ns[3] = 85;
	  ns[4] = 62;
	  for(int i = 0; i < ns.length;i++) {
		  System.out.println(ns[i]);
	  }
	  double[] doubleArray = new double[5];
	  for(int i = 0; i < doubleArray.length;i++) {
		  System.out.println(doubleArray[i]);
	  }
	  boolean[] booleanArray = new boolean[5];
	  for(int i = 0; i < booleanArray.length; i++) {
		  System.out.println(booleanArray[i]);
	  }
	  //integer array with intialization
	  int[] intArray1 = new int[5];
	  System.out.println(intArray1.length);
	  int[] intArray2 = new int[] {68,79,91,85,62};
	  System.out.println(intArray2.length);
	  intArray1 = new int[3];
	  System.out.println(intArray1.length);
	  
  }
}
