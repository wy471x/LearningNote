package MultithreadProgramming;

import java.util.concurrent.locks.StampedLock;

public class UseStampedLock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Point p = new Point();
       new Thread(()-> { 
    	   p.move(2, 3);
       }  ).start();
       Thread.sleep(10);
       System.out.println(p.distanceFromOrigin());
       new Thread(()-> { 
    	   p.move(4, 5);
       }  ).start();
       Thread.sleep(10);
       System.out.println(p.distanceFromOrigin());
       
       new Thread(()-> { 
    	   p.move(6, 7);
       }  ).start();
       Thread.sleep(10);
       System.out.println(p.distanceFromOrigin());
	}

}

class Point{
	private final StampedLock stampedLock = new StampedLock();
	private double x = 0;
	private double y = 0;
	
	public void move(double deltaX,double deltaY) {
		long stamp = stampedLock.writeLock();
		try {
			x += deltaX;
			y += deltaY;
		}finally {
			stampedLock.unlockWrite(stamp);
		}
	}
	
	public double distanceFromOrigin() {
		long stamp = stampedLock.tryOptimisticRead();
		double currentX = x;
		double currentY = y;
		
		if(!stampedLock.validate(stamp)) {
			stamp = stampedLock.readLock();
			try {
				currentX = x;
				currentY = y;
			}finally {
				stampedLock.unlock(stamp);
			}
		}
		return Math.sqrt(currentX * currentX + currentY * currentY);
	}
}