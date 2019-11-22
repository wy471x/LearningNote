package MultithreadProgramming;

public class ThreadState {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
       Thread t = new Thread(()-> { 
    	  System.out.println("hello"); 
       });
       System.out.println("start");
       t.start();
       t.join(1);
       System.out.println("end");
       
	}

}
