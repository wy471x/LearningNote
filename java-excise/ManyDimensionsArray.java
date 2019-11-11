import java.util.*;

public class ManyDimensionsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] ns = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(ns.length);
        
        // 
        int[] arr0 = ns[0];
        System.out.println(arr0.length);
        System.out.println(Arrays.toString(arr0));
        
        int[][] ns1 = {{1,2,3,4},{5,6},{7,8,9}};
        System.out.println(ns1[0].length);
        System.out.println(ns1[1].length);
        System.out.println(ns1[2].length);
        //excise
        int[][] scores = {
        		{82,90,91},
        		{68,72,64},
        		{95,91,89},
        		{67,52,60},
        		{79,81,85},
        };
        
        
        
        double average = 0;
        int total = 0,numberOfArray = 0;
        for(int i = 0; i < scores.length;i++) {
        	for(int j = 0 ; j < scores[i].length;j++) {
        		total += scores[i][j];
        	}
        	numberOfArray += scores[i].length;
        }
        average = total / numberOfArray;
        System.out.println(average);
	}

}
