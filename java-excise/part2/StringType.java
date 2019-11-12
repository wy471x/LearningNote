package OOP;

import java.util.Arrays;

public class StringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".endsWith("lo"));
        System.out.println("\tHello\r\n");
        //delete blank character in end and start
        System.out.println("\tHello\r\n".trim());
        
        //regular expression
        String s2 = "A,,B;C ,D";
        System.out.println(s2.replaceAll("[\\,\\;\\s]+", ","));
        
        //other type to String
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(45.67));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new Object()));
        
        //String to Integer
        int n1 = Integer.parseInt("123");
        System.out.println(n1);
        int n2 = Integer.parseInt("1110",2);
        System.out.println(n2);
        
        //String to boolean
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        boolean b2 = Boolean.parseBoolean("FALSE");
        System.out.println(b2);
        
        //char[] -> String  String -> char[]
        char[] cs = "Hello".toCharArray();
        System.out.println(cs);
        String s3 = new String(cs);
        System.out.println(s3);
        
        
        int[] scores = new int[] {88,77,51,66};
        Score score = new Score(scores);
        score.printScores();
        scores[2] = 99;
        score.printScores();
        
        //UTF-8 
        byte[] byte1 = "Hello".getBytes();
       
	}
}

class Score{
	private final int[] scores;
	public Score(int[] scores) {
		this.scores = scores;
	}
	
	public void printScores() {
		System.out.println(Arrays.toString(scores));
	}
}
