package Collection;
import java.util.*;

public class MapType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s = new Student("Xiao Ming",99);
        Map<String,Student> map = new HashMap<>();
        map.put("Xiao Ming", s);
        Student target = map.get("Xiao Ming");
        System.out.println(target == s);
        System.out.println(target.score);
        Student s2 = new Student("Bob",89);
        map.put("Bob", s2);
        Student another = map.get("Bob");
        System.out.println(another.name + "," + another.score);
	    System.out.println(map.containsKey("Xiao Ming"));
	    System.out.println(map.containsKey("Alice"));
	    
	    //unmultiply elements in the map
	    Map<String,Integer> map2 = new HashMap<>();
	    map2.put("apple", 123);
	    map2.put("pear",456);
	    System.out.println(map2.get("apple"));
	    System.out.println(map2.get("pear"));
	    System.out.println(map2.size());
	    map2.put("apple", 789);
	    System.out.println(map2.get("apple"));
	    System.out.println(map2.size());
	    
        //traverse map
	    map2.put("banana", 987);
	    for(String key : map2.keySet()) {
	    	Integer value = map2.get(key);
	    	System.out.println("keySet :" + key + " = " + value);
	    }
	    for(Map.Entry<String, Integer> entry : map2.entrySet()) {
	    	String key = entry.getKey();
	    	Integer value = entry.getValue();
	    	System.out.println("entrySet :" + key + " = " + value);
	    }
	    
	    //excise
	    
	    
	}

}
class Students{
	List<Student> list;
	Map<String,Integer> cache;
	
	Students(List<Student> list){
		this.list = list;
		cache = new HashMap<>();
	}
	
	int getScore(String name) {
		Integer score = this.cache.get(name);
		if(score == null) {
		    return -1;
		}
		return score == null ? -1 : score.intValue();
	}
}

class Student{
	public String name;
	public int score;
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
}