package Collection;

import java.util.*;


public class ListType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("apple");
        list.add(null);
        //Index visit
        System.out.println(list.size());
        System.out.println(list.get(3));
        List<String> list2 = new ArrayList<>(Arrays.asList("apple","pear","banana"));
        for(int i = 0; i < list2.size(); i++) {
        	String s = list2.get(i);
        	System.out.println(s);
        }
        //Iterator visit
        List<String> list3 = new ArrayList<>(Arrays.asList("apple","pear","banana"));
        for(Iterator<String> it = list3.iterator(); it.hasNext();) {
        	 String s = it.next();
        	 System.out.println(s);
        }
        //Iterator use in for-each loop
        List<String> list4 = new ArrayList<>(Arrays.asList("apple","pear","banana"));
        for(String s : list4) {
        	System.out.println(s);
        }
        
        // List to Array
        List<String> list5 = new ArrayList<>(Arrays.asList("apple","pear","banana"));
        Object[] array = list5.toArray();
        for(Object s : array) {
        	System.out.println(s);
        }
        
        List<Integer> list6 = new ArrayList<>(Arrays.asList(11,22,33));
        Integer[] array2 = list6.toArray(new Integer[3]);
        for(Integer n : array2) {
        	System.out.println(n);
        }
        //Array to List
        List<Integer> list7 = new ArrayList<>(Arrays.asList(11,22,33));
        list7.add(44);
        for(Integer n : list7) {
        	System.out.println(n);
        }
        
        //excise 1
        final int start = 10;
        final int end = 20;
        List<Integer> list8 = new ArrayList<>();
        for(int i = start;i <= end; i++) {
        	list8.add(i);
        }
        int removed = list8.remove((int)(Math.random() * list8.size()));
        System.out.println("removed number: " + removed);
        int found = findMissingNumberOrdered(start,end,list8);
        System.out.println(list8.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "²âÊÔ³É¹¦" : "²âÊÔÊ§°Ü");
        
        //excise 2
        List<Integer> list9 = new ArrayList<>();
        for(int i = start;i <= end; i++) {
        	list9.add(i);
        }
        Collections.shuffle(list9);
        int removed2 = list9.remove((int)(Math.random() * list9.size()));
        System.out.println("removed number: " + removed2);
        int found2 = findMissingNumberUnordered(start,end,list9);
        System.out.println(list9.toString());
        System.out.println("missing number: " + found2);
        System.out.println(removed2 == found2 ? "²âÊÔ³É¹¦" : "²âÊÔÊ§°Ü");
        
        
        
	}
	static int findMissingNumberOrdered(int start,int end,List<Integer> list) {   
		int result = 0;
		int i = 0;
		for(; i < list.size(); i++) {
		    	if(list.get(i) % 10 != i) {
		    			result =  10 + i;
		    			break;
		    	}
		}
		if(i == list.size()) {
			result = 20;
		}
		return result;
	}
	
	static int findMissingNumberUnordered(int start,int end,List<Integer> list) {
		int[] tempArray = new int[21];
		for(int i = 0; i < list.size(); i++) {
			tempArray[list.get(i)] = 1;
		}
		int j = 10;
		for(; j < 21;j++) {
			if(tempArray[j] != 1) {
				break;
			}
		}
		return j;
	}

}
