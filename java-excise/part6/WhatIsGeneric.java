package Generic;

import java.util.ArrayList;

public class WhatIsGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> integerList = new ArrayList<Integer>();
       for(int i = 0; i < 10; i++)
          integerList.add(new Integer(i));
       for(Integer i : integerList)
    	   System.out.println(i);
       
	}

}
