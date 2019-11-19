package Collection;
import java.util.Deque;
import java.util.LinkedList;

public class DequeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("apple");
        deque.offerFirst("banana");
        deque.offerLast("mango");
        deque.offerFirst("watermelon");
        
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        
        
	}

}
