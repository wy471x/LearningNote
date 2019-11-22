package MultithreadProgramming;

public class CreateNewThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Thread t = new MyThread();
        //Thread t = new Thread(new MyRunnable());
		// lambda expression
//		System.out.println("main start...");
//		Thread t = new Thread(()-> {
//			System.out.println("start  thread!");
//			System.out.println("end  thread!");
//		});
//		t.start();
//		System.out.println("main end...");
		
		System.out.println("main start...");
		Thread t2 = new Thread() {
			public void run(){
				System.out.println("thread run...");
//				try {
//					Thread.sleep(10);
//				}catch(InterruptedException e) {}
				System.out.println("thread end.");
			}
		};
		t2.start();
		try {
			Thread.sleep(20);
			
		}catch(InterruptedException e) {}
		System.out.println("main end...");
	}
}

// method 1 :
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("start new thread!");
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("start new thread!");
	}
}