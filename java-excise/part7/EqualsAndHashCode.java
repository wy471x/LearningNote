package Collection;
import java.util.*;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String key1 = "a";
        Map<String,Integer> map = new HashMap<>();
        map.put(key1, 123);
        
        String key2 = new String("a");
        map.get(key2);
        
        System.out.println(key1 == key2);
        System.out.println(key1.equals(key2));
	}
}