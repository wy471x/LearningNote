package ExceptionHandling;

import java.util.Arrays;
import java.io.*;

public class JavaException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//        byte[] bs = toGBK("ÍòÓÂ");
//        System.out.println(Arrays.toString(bs));
//        try {
//        	process1();
//        }catch(Exception e){
//        	e.printStackTrace();
//        }
//        
//        try {
//        	process3();
//        }catch(Exception e) {
//        	   e.printStackTrace();
//        }
//        
//        try {
//        	Integer.parseInt("abc");
//        }catch(Exception e){
//        	System.out.println("catched");
//        	throw new RuntimeException(e);
//        }finally {
//        	System.out.println("finally");
//        }
//        
//        Exception origin = null;
//		try {
//        	System.out.println(Integer.parseInt("abc"));
//        }catch(Exception e) {
//        	origin = e;
//        	throw e;
//        }finally {
//        	Exception e = new IllegalArgumentException();
//        	if(origin != null) {
//        		e.addSuppressed(origin);
//        	}
//        	throw e;
//        }
		  try {
			  process5(-1);
		  }catch(Exception e) {
			  throw new IllegalArgumentException();
		  }
	}
	
	static void process1() {
		process2();
	}
	static void process2() {
		Integer.parseInt(null);
	}
	static void process3() {
		try {
			process4();
		}catch(NullPointerException e) {
			throw new IllegalArgumentException(e);
		}
	}
	static void process4() {
		throw new NullPointerException();
	}
	static void process5(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		
	}
	static byte[] toGBK(String s) {
		try {
			return s.getBytes("GBK");
		}catch (UnsupportedEncodingException e){
			System.out.println(e);
			return s.getBytes();
		}
	}

}
