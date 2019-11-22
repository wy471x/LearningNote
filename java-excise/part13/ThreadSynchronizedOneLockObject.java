package MultithreadProgramming;

public class ThreadSynchronizedOneLockObject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        var add = new AddThread();
        var dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
	}

}

class Counter{
	public static int count = 0;
	public static Object lock = new Object();
}

class AddThread extends Thread{
	public void run() {
		for(int i = 0; i < 10000; i++) {
			synchronized(Counter.lock) {//lock
			  Counter.count += 1;
			}//unlock
		}
	}
}

class DecThread extends Thread{
	public void run() {
		for(int i = 0 ; i < 2000; i++) {
		  synchronized(Counter.lock) {//lock	
			Counter.count -= 1;
		  }//unlock
		}
	}
}