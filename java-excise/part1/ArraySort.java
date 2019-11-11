import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numberArray = {12,4,23,8,34,13,35};
        System.out.println(Arrays.toString(numberArray));
        for(int i = 0; i < numberArray.length-1;i++) {
        	for(int j = 0;j < numberArray.length - i - 1;j++) {
        		if( numberArray[j] > numberArray[j +1] ){
        			int tmp = numberArray[j];
        			numberArray[j] = numberArray[j + 1];
        			numberArray[j + 1] = tmp;
        		}
        	}
        }
        System.out.println(Arrays.toString(numberArray));
        for(int i = 0,j = numberArray.length - 1;i < j;i++,j--) {
        	int tmp = numberArray[i];
        	numberArray[i] = numberArray[j];
        	numberArray[j] = tmp;
        }
        System.out.println(Arrays.toString(numberArray));
        int[] ns = {28,12,89,73,65,18,96,50,8,36};
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        for(int i = 0,j = ns.length - 1;i < j;i++,j--) {
        	int tmp = ns[i];
        	ns[i] = ns[j];
        	ns[j] = tmp;
        }
        System.out.println(Arrays.toString(ns));
	}

}
