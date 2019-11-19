package Collection;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class PriorityQueueType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //lexicographical order as default
		Queue<String> qs = new PriorityQueue<>();
        qs.offer("apple");
        qs.offer("pear");
        qs.offer("banana");
        System.out.println(qs.poll());
        System.out.println(qs.poll());
        System.out.println(qs.poll());
        System.out.println(qs.poll());
        
        //Queue<User> qu = new PriorityQueue<>(new UserComparator());
        Queue<User> qu = new PriorityQueue<>(new Comparator<User>() {
        	public int compare(User u1,User u2) {	
        		if(u1.number.charAt(0) == u2.number.charAt(0)) {
        			return Integer.valueOf(u1.number.substring(1)).compareTo(Integer.valueOf(u2.number.substring(1)));
        		}
        		
        		if(u1.number.charAt(0) == 'V') {
        			return -1;
        		}else {
        			return 1;
        		}
        	}       
        });
        qu.offer(new User("Bob","A1"));
        qu.offer(new User("Alice","A2"));
        qu.offer(new User("Boss","V1"));
        qu.offer(new User("Kobe","A10"));
        qu.offer(new User("Jordan","A20"));
        
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
	} 

}
class UserComparator implements Comparator<User>{
	public int compare(User u1,User u2) {	
		if(u1.number.charAt(0) == u2.number.charAt(0)) {
			return Integer.valueOf(u1.number.substring(1)).compareTo(Integer.valueOf(u2.number.substring(1)));
		}
		
		if(u1.number.charAt(0) == 'V') {
			return -1;
		}else {
			return 1;
		}
	}
}

class User{
	public final String name;
	public final String number;
	
	public User(String name,String number) {
		this.name = name;
		this.number = number;
	}
	
	public String toString() {
		return name + "/" + number;
	}
}
