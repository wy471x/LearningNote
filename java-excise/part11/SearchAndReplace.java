package RegularExpression;
import java.util.regex.*;
public class SearchAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "the quick  brown fox jumps  over the lazy dog.";
        Pattern p = Pattern.compile("\\wo\\w");
        Matcher m = p.matcher(s);
        while(m.find()) {
        	String sub = s.substring(m.start(),m.end());
        	System.out.println(sub);
        }
        
        String s2 = "the           quick\t\t brown   fox    jumps over the lazy dog.";
        String r = s.replaceAll("\\s+", " ");
        System.out.println(r);
        
        String r2 = s.replaceAll("\\s([a-z]{4,5})\\s", "<b>$1<b>");
        System.out.println(r2);
	}

}
