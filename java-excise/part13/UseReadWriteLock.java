package MultithreadProgramming;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class UseReadWriteLock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        var c = new Counter5();
        new Thread( ()->{  
        	c.inc(0);
        }  ).start(); 
        new Thread( ()->{  
        	c.inc(1);
        }  ).start(); 
        new Thread( ()->{  
        	c.inc(2);
        }  ).start(); 
        new Thread( ()->{  
        	c.inc(3);
        }  ).start(); 
        new Thread( ()->{  
        	c.inc(4);
        }  ).start(); 
        new Thread( ()->{  
        	c.inc(5);
        }  ).start(); 
        for(int j : c.get())
           System.out.println(j);
	}

}

class Counter5{
	private final ReadWriteLock rwlock = new ReentrantReadWriteLock();
	private final Lock rlock = rwlock.readLock();
	private final Lock wlock = rwlock.writeLock();
	private int[] counts = new int[10];
	
	public void inc(int index) {
		wlock.lock();
		try {
			counts[index] += 1;
		}finally {
			wlock.unlock();
		}
	}
	
	public int[] get(){
		rlock.lock();
		try{
			return Arrays.copyOf(counts, counts.length);
		}finally {
			rlock.unlock();
		}
	}
}
