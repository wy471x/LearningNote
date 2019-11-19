package Collection;

import java.util.*;

public class StackType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toHex2(12500));
		String hex = toHex2(12500);
		if( hex.equalsIgnoreCase("30D4")) {
			System.out.println("²âÊÔÍ¨¹ý");
		}else {
			System.out.println("²âÊÔÊ§°Ü");
		}
        
	}
	static int increase(int x) {
		return increase(x) + 1;
	}
    static String toHex1(int n) {
    	String tempString = "";
    	while(n > 0) {
    		int tempNumber = n % 16;
    		n /= 16;
    		if(tempNumber > 9) {
    			switch(tempNumber) {
    			  case 10 : tempString += "A"; break;
    			  case 11 : tempString += "B"; break;
    			  case 12 : tempString += "C"; break;
    			  case 13 : tempString += "D"; break;
    			  case 14 : tempString += "E"; break;
    			  case 15 : tempString += "F"; break;
    			}
    			continue;
    		}
    		tempString += Integer.toString(tempNumber);
    	}
    	String resultString = "";
    	for(int i = tempString.length() - 1;i >= 0;i--) {
    		resultString += tempString.charAt(i);
    	}
    	return resultString;
    }
    static String toHex2(int n) {
    	Deque<String> ds = new LinkedList<>();
    	while(n > 0) {
    		int tempNumber = n % 16;
    		n /= 16;
    		if(tempNumber > 9) {
    			switch(tempNumber) {
    			case 10 : ds.push("A"); break;
    			case 11 : ds.push("B"); break;
    			case 12 : ds.push("C"); break;
    			case 13 : ds.push("D"); break;
    			case 14 : ds.push("E"); break;
    			case 15 : ds.push("F"); break;
    			}
    			continue;
    		}
    		ds.push(Integer.toString(tempNumber));
    	}
    	String resultString = "";
    	while(ds.peek() != null) {
    		resultString += ds.peek();
    		ds.pop();
    	}
    	return resultString;
    }
}
