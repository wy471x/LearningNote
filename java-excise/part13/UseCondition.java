package MultithreadProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseCondition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        var q = new TaskQueue2();
      var ts = new ArrayList<Thread>();
		for(int i = 0; i < 5;i++) {
			var customer = new Thread() {
				public void run() {
					while(true) {
						try {
							String s = q.getTask();
							System.out.println( "customer "+ this.getId() +" execute task: " + s);
						}catch (InterruptedException e) {
							return ;
						}
					}
				}
			};
			customer.start();
			ts.add(customer);
	   }
//        var customer = new Thread() {
//        	public void run() {
//        		while(true) {
//        			try {
//        				String s = q.getTask();
//        				System.out.println("customer " + this.getId() + " " + "execute task = " + s);
//        			}catch(InterruptedException e) {
//        				return;
//        			}
//        		}
//        	}
//        };
//        customer.start();
        var productor = new Thread() {
          public void run() {
			for(int i = 0;i < 10;i++) {
				String s = "t:" + Math.random();
				System.out.println("productor " + this.getId()+ " " + " add task: " + s);
				q.addTask(s);
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {}
				
			}
          }
		};
		productor.start();
		productor.join();
		for(var t : ts) {
			t.interrupt();
		}
		
		//customer.interrupt();
	}

}

class TaskQueue2{
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private Queue<String> queue = new LinkedList<>();
	
	public void addTask(String s) {
		lock.lock();
		try {
			queue.add(s);
			condition.signalAll();
		}finally {
			lock.unlock();
		}
	}
	
	public String getTask() throws InterruptedException {
		lock.lock();
		try {
			while(queue.isEmpty()) {
				condition.await();
			}
			return queue.remove();
		}finally {
			lock.unlock();
		}
	}
}