package MultithreadProgramming;

public class SynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        var c1 = new Counter3();
        var c2 = new Counter3();
        new Thread(() -> {
            c1.add(1);
        }).start();
        new Thread(() -> {
            c1.dec(1);
        }).start();

        // 对c2进行操作的线程:
        new Thread(() -> {
            c2.add(1);
        }).start();
        new Thread(() -> {
            c2.dec(1);
        }).start();
        System.out.println(c1.get());
        System.out.println(c1.get());
	}


}

 class Counter3{
	private int count = 0;
	public void add(int n) {
		synchronized(this) {
			count += n;
		}
	}
	public void dec(int n) {
		synchronized(this) {
			count -= n;
		}
	}
	// above equal below
	public synchronized void dec2(int n) {
		 count -= n;
	}
	public int get() {
		return count;
	}
}