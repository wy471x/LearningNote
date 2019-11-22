package MultithreadProgramming;

import java.time.LocalTime;

public class DaemonThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Thread t = new MyThread4();
		t.setDaemon(true);
		t.start();
		Thread.sleep(10000);
        t.join();
        t.interrupt();
        System.out.println("main end.");
	}
}

class TimerThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				 Thread.sleep(1000);
			}catch(InterruptedException e) {
				 break;
			}
		}
	}
}

class MyThread4 extends Thread{
	@Override
	public void run() {
		System.out.println("Daemon Thread!");
		TimerThread th = new TimerThread();
		th.start();
	}
}