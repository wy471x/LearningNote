package RegularExpression;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isValidMobileNumber("13510001000"));
	    String regex = "2\\d\\d\\d";
	    System.out.println("2019".matches(regex));
	    System.out.println("2100".matches(regex));
	    //excise
	    String regex2 = "0\\d{2,3}-[1-9]\\d{6,7}";
	    for(String s : List.of("010-12345678","020-9999999", "0755-7654321")) {
	    	if(!s.matches(regex2)){
	    		System.out.println("≤‚ ‘ ß∞‹£∫" + s);
	    		
	    	}
	    }
	    for(String s : List.of("010 12345678","A20-9999999","0755-7654.321")) {
	    	 if(!s.matches(regex2)) {
	    		 System.out.println("≤‚ ‘ ß∞‹ : " + s);
	    	 }
	    }
	    System.out.println("≤‚ ‘≥…π¶!");
	    
	    Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
	    Matcher m = p.matcher("010-12345678");
	    if(m.matches()) {
	    	String g0 = m.group(0);
	    	String g1 = m.group(1);
	    	String g2 = m.group(2);
	    	System.out.println(g0);
	    	System.out.println(g1);
	    	System.out.println(g2);
	    }else {
	    	System.out.println("∆•≈‰ ß∞‹£°");
	    }
	    
	    //excise
	    Pattern p2 = Pattern.compile("([0-2][0-9])\\:([0-5][0-9])\\:([0-5][0-9])");
	    Matcher m2 = p2.matcher("23:01:59");
	    if(m2.matches()) {
	    	String g0 = m2.group(0);
	    	String g1 = m2.group(1);
	    	String g2 = m2.group(2);
	    	String g3 = m2.group(3);
	    	System.out.println(g0);
	    	System.out.println(g1);
	    	System.out.println(g2);
	    	System.out.println(g3);
	    }else {
	    	System.out.println("∆•≈‰ ß∞‹£°");
	    }
	    
	    //Non-greedy matching
	    Pattern pattern = Pattern.compile("(\\d+)(0*)");
	    Matcher matcher = pattern.matcher("1230000");
	    if(matcher.matches()) {
	    	System.out.println("group1=" + matcher.group(1));
	    	System.out.println("group1=" + matcher.group(2));
	    }
	    Pattern pattern2 = Pattern.compile("(\\d+?)(0*)");
	    Matcher matcher2 = pattern2.matcher("1230000");
	    if(matcher2.matches()) {
	    	System.out.println(matcher.groupCount());
	    	System.out.println("group1=" + matcher2.group(1));
	    	System.out.println("group1=" + matcher2.group(2));
	    }
	    //regular expression default as greedy matching
	    Pattern p3 = Pattern.compile("cat");
	    Matcher m3 = p3.matcher("one cat two cats in the yard");
	    StringBuffer sb = new StringBuffer();
	    while(m3.find()) {
	    	m3.appendReplacement(sb, "dog");
	    }
	    m3.appendTail(sb);
	    System.out.println(sb.toString());
	    
	    //test
	    Pattern pattern4 = Pattern.compile("\\$\\{(\\w+)\\}");
	    Matcher m4= pattern4.matcher("Hello, ${name}! You are learning ${lang}!");
	    StringBuilder sb2 = new StringBuilder();
	    Map<String, Object> data = new HashMap<>();
		data.put("name", "Bob");
		data.put("lang", "Java");
		while(m4.find()) {
			String subString = "Hello, ${name}! You are learning ${lang}!".substring(m4.start(),m4.end());
			Matcher matcher1 = pattern4.matcher(subString);
			if(matcher1.matches()) {
				m4.appendReplacement(sb2, data.get(matcher1.group(1)).toString());
			}
		    
		}
		m4.appendTail(sb2);
		System.out.println(sb2.toString());
	    
	    
	}
	public static boolean isValidMobileNumber(String s) {
		return s.matches("\\d{11}");
	}

}
