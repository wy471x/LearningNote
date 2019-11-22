package MultithreadProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaitAndNotify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		var q = new TaskQueue();
		var ts = new ArrayList<Thread>();
		for(int i = 0; i < 5;i++) {
			var customer = new Thread() {
				public void run() {
					while(true) {
						try {
							String s = q.getTask();
							System.out.println("execute task: " + s);
						}catch (InterruptedException e) {
							return ;
						}
					}
				}
			};
			customer.start();
			ts.add(customer);
	   }
		var productor = new Thread(()->{
			for(int i = 0;i < 10;i++) {
				String s = "t:" + Math.random();
				System.out.println("add task: " + s);
				q.addTask(s);
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {}
				
			}
		});
		productor.start();
		productor.join();
		Thread.sleep(100);
		
		for(var c : ts) {
			c.interrupt();
		}
		
	}

}

class TaskQueue{
	Queue<String> queue = new LinkedList<>();
	public synchronized void addTask(String s) {
		this.queue.add(s);
		this.notifyAll();
	}
	
	public synchronized String getTask() throws InterruptedException{
		if(queue.isEmpty()) {
			this.wait();
		}
		return queue.remove();
	}
}