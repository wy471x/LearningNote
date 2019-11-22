package MultithreadProgramming;

import java.util.concurrent.locks.*;

public class UseReentrantLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        var c1 = new Counter4();
        var c2 = new Counter4();
        
        new Thread(()->{ 
        	c1.add(2);
        } ).start();;
        new Thread(()->{  
        	c1.add(3);
        }).start();
        
        System.out.println(c1.get());
        System.out.println(c2.get());
	}

}

class Counter4{
	private final Lock lock = new ReentrantLock();
	
	private int count = 0;
	
	public void add(int n) {
		lock.lock();
		try {
			count += n;
		}finally {
			lock.unlock();
		}
	}
	
	public int get() {
		return this.count;
	}
}