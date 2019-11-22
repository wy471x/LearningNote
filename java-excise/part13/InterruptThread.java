package MultithreadProgramming;

public class InterruptThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//        Thread t = new MyThread2();
//        t.start();
//        Thread.sleep(2);
//        t.interrupt();
//        t.join();
//        System.out.println("end");
		  Thread t = new MyThread3();
		  t.start();
		  Thread.sleep(1000);
		  t.interrupt();
		  t.join();
		  System.out.println("end");
//		  HelloThread2 t = new HelloThread2();
//		  t.start();
//		  Thread.sleep(1);//main thread sleep
//		  t.running = false;
	}

}

class MyThread2 extends Thread {
	public void run(){
		int n = 0;
		while( ! isInterrupted()) {
			n++;
			System.out.println(n + " hello!");
		}
	}
}

class MyThread3 extends Thread{
	public void run() {
		Thread hello = new HelloThread();
		hello.start();
		try {
			hello.join();
			
		}catch (InterruptedException e) {
			System.out.println("interrupted!");
		}
		hello.interrupt();
	}
}

class HelloThread extends Thread{
	public void run() {
		int n = 0;
		while( !isInterrupted()) {
			n++;
			System.out.println(n + " hello!");
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				break;
			}
		}
	}
}
class HelloThread2 extends Thread{
	public volatile boolean running = true;
	public void run() {
		int n = 0;
		while(running) {
			n++;
			System.out.println(n + " hello!");
		}
		System.out.println("end");
	}
}