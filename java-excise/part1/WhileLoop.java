
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
        int m = 20;
        int n = 100;
        while(m <= n) {
        	sum += m;
        	m++;
        }
        System.out.println(sum);
        for(int i = m; i < n;++i) {
        	sum += i;
        }
        System.out.println(sum);
        int[] ns = {1,4,9,16,25};
        for(int i : ns)
        	System.out.println(i);
	}

}
