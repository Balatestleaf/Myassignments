package week4.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
	//Declare given arrays
		int[] a= {3, 2, 11, 4, 6, 7};
		int[] b= {1, 2, 8, 4, 9, 7};
		
    //add array elements to list 
		List<Integer> I=new ArrayList<>();
		
	//for loop
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					I.add(a[i]);
				}
			}
		}
		
		System.out.println("compare the values are :" +I);
	}

}
