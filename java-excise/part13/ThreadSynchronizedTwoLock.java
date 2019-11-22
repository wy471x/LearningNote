package MultithreadProgramming;

public class ThreadSynchronizedTwoLock {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    long startTime = System.currentTimeMillis();
		    var ts = new Thread[] { new AddStudentThread(), new DecStudentThread(), new AddTeacherThread(), new DecTeacherThread() };
	        for (var t : ts) {
	            t.start();
	        }
	        for (var t : ts) {
	            t.join();
	        }
	        System.out.println(Counter2.studentCount);
	        System.out.println(Counter2.teacherCount);
	        long endTime = System.currentTimeMillis();
	        System.out.println("used time = " + (endTime - startTime ) + "ms");
	 }
}



class Counter2{
	//public static final Object StudentLock = new Object();
	//public static final Object TeacherLock = new Object();
	public static final Object Lock = new Object();
	public static int studentCount = 0;
	public static int teacherCount = 0;
}

class AddStudentThread extends Thread{
	public void run() {
		for(int i = 0; i < 100000000; i++) {
			synchronized/*(Counter2.StudentLock)*/(Counter2.Lock) {
				Counter2.studentCount += 1;
			}
		}
	}
}

class DecStudentThread extends Thread{
	public void run() {
		for(int i = 0; i < 100000000; i++) {
		    synchronized/*(Counter2.StudentLock)*/(Counter2.Lock) {
				Counter2.studentCount -= 1;
			}
		}
	}
}

class AddTeacherThread extends Thread{
	public void run() {
		for(int i = 0; i < 100000000; i++) {
			synchronized/*(Counter2.TeacherLock)*/(Counter2.Lock) {
				Counter2.teacherCount += 1;
			}
		}
	}
}

class DecTeacherThread extends Thread{
	public void run() {
		for(int i = 0; i < 100000000; i++) {
			synchronized/*(Counter2.TeacherLock)*/(Counter2.Lock) {
				Counter2.teacherCount -= 1;
			}
		}
	}
}
