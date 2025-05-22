package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
	//Declare an array	
    Integer[] a =  {1, 2, 3, 4, 10, 6, 8};
    System.out.println("Missing numbers are :");
    
    //Array into the list
    List<Integer> x=Arrays.asList(a);
    
    //Collection for ascending order
    Collections.sort(x);
   
    //for loop 
    for (int i = 0; i < x.size()-1; i++) {
	if (x.get(i)+1!=x.get(i+1)) {
		for (int j = x.get(i)+1; j < x.get(i+1); j++) {
			System.out.print(" " +j);
		}
	}
    	
	}

	}

}
