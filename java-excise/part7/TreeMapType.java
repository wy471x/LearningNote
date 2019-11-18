package Collection;
import java.util.*;

public class TreeMapType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for(String key : map.keySet()) {
        	System.out.print(key + " ");
        	Integer value = map.get(key);
        	System.out.println(value);
        }
        
        //sorted map
        Map<StudentTwo, Integer> map2 = new TreeMap<>(new Comparator<StudentTwo>() {
            public int compare(StudentTwo p1, StudentTwo p2) {
                return p1.score > p2.score ? -1 : 1;
            }
        });
        map2.put(new StudentTwo("Tom", 77), 1);
        map2.put(new StudentTwo("Bob", 66), 2);
        map2.put(new StudentTwo("Lily", 99), 3);
        for (StudentTwo key : map2.keySet()) {
            System.out.println(key);
        }
        System.out.println(map2.get(new StudentTwo("Bob", 66)));
	}

}

class StudentTwo {
    public String name;
    public int score;
    StudentTwo(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return String.format("{%s: score=%d}", name, score);
    }
}