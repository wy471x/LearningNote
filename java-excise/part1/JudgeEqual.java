import java.util.Scanner;

public class JudgeEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // double number judge equal
		double x = 1 - 9.0/10;
		if(x == 0.1) {
           System.out.println("x equal to 0.1");	    		
 		}else {
 			System.out.println("x is not equal to 0.1");
 		}
		if(Math.abs(x - 0.1) < 0.00001) {
			System.out.println("x is 0.1");
		}else {
			System.out.println("x is not 0.1");
		}
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		//Error example
		/*String s3 = null;
		if(s3.equals("hello")) {
			System.out.println("hello");
		}*/
		String s4 = null;
		if("hello".equals(s4)) {
			System.out.println("hello");
		}else {
			System.out.println("s4 is not \"hello\"");
		}
		//excise
		Scanner scanner = new Scanner(System.in);
		int weight = scanner.nextInt();
		double height = scanner.nextDouble();
		double BMI  = weight / Math.pow(height, 2);
		System.out.println(BMI);
		if(BMI < 18.5) {
			System.out.println("thin");
		}else if( BMI >= 18.5 && BMI <= 25) {
			System.out.println("normal");
		}else if(BMI > 25 && BMI < 28) {
			System.out.println("over weight");
		}else if(BMI >= 28 && BMI <= 32) {
			System.out.println("fat");
		}else {
			System.out.println("very fat");
		}
		
		
}

}
