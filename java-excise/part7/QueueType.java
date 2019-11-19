package Collection;

import java.util.Queue;
import java.util.LinkedList;

public class QueueType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        
        q.offer("watermelon");
        System.out.println(q.peek());
	}

}
