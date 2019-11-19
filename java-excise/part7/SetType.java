package Collection;
import java.util.*;
public class SetType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc")); //add successfully
        System.out.println(set.add("xyz")); //add successfully
        System.out.println(set.add("xyz")); //fail successfully
        System.out.println(set.contains("xyz")); //true
        System.out.println(set.contains("XYZ")); //false
        System.out.println(set.contains("abc")); //true
        
        
        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("pear");
        set2.add("orange");
        for(String s : set2) {
        	System.out.println(s);
        }
        
        Set<String> set3 = new TreeSet<>();
        set3.add("apple");
        set3.add("banana");
        set3.add("pear");
        set3.add("orange");
        for(String s : set3) {
        	System.out.println(s);
        }
        
        
        Set<StudentThree> sts = new TreeSet<>(new Comparator<StudentThree>() {
        	          public int compare(StudentThree s1,StudentThree s2) {
        	        	  if(s1.name.equals(s2)) {
        	        		  return 0;
        	        	  }
        	        	  return s1.name.compareToIgnoreCase(s2.name);
        	          }
        });
        
        sts.add(new StudentThree("Kobe",99));
        sts.add(new StudentThree("Bob",89));
        sts.add(new StudentThree("Curry",99));
        for(StudentThree st : sts) {
        	System.out.println(st.name +" : " +  st.score);
        }
	}

}

class StudentThree{
	public String name;
	public Integer score;
	public StudentThree(String name,Integer score) {
		this.name = name;
		this.score =score;
	}
}
