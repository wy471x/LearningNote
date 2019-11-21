package UnitTest;

public class Factorial {
	public static long fact(long n) {
        if(n < 0) {
        	throw new IllegalArgumentException();
        }else if( n > 20) {
        	throw new ArithmeticException();
        }
		long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
