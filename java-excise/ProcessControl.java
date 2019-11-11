
import java.util.Scanner;

public class ProcessControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //input moduel
		System.out.print("a,");
		System.out.print("b,");
		System.out.print("c.");
		System.out.println();
		System.out.print("end\n");
		double d = 12900000;
		System.out.println(d);
		System.out.printf("%e\n",d);
		int n = 12345000;
		System.out.printf("n = %d,hex = %08x\n\n",n,n);
		//output moduel
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your name:");
		String name = scanner.nextLine();
		System.out.print("Input your age:");
		int age = scanner.nextInt();
		System.out.printf("Hi,%s,you are %d\n",name,age);
		*/
		//excise
		Scanner scanner1 = new Scanner(System.in);
		int oldGrade = scanner1.nextInt();
		int newGrade = scanner1.nextInt();
		double rateIncrement = (double)(newGrade - oldGrade) / oldGrade * 100;
		System.out.printf("%.2f%%\n",rateIncrement);
	}

}
