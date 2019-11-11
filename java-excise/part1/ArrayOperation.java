import java.util.Arrays;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ns = {1,4,9,16,25};
        String[] sa = {"hello","world","I","love","you"};
        System.out.println(ns);
        System.out.println(sa);
		for(int i = 0; i < ns.length;++i) {
			System.out.println(ns[i]);
		}
		for(int i = 0; i < sa.length;++i) {
			System.out.println(sa[i]);
		}
		for(int i : ns) {
			System.out.println(i);
		}
		for(String i : sa) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(ns));
		System.out.println(Arrays.toString(sa));
	}

}
