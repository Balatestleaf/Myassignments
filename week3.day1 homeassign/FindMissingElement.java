package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
// input numbers		
		int num[] ={1,4,3,2,8,6,7};
// array length
		int arraylength = num.length;
		System.out.println(arraylength);
// for loop	
				for (int i = 0; i < num.length; i++) {
					System.out.println(num[i]);
				}
//sort an array
		Arrays.sort(num);//1,2,3,4,6,7,8
		System.out.println(num[arraylength-1]);
//to find max value
		int maxvalue=num[arraylength-1];
		System.out.println(maxvalue+ "maxvalue");
//for loop to find missing number 
		for (int i = 0; i < num.length; i++) {
			i=i+1;
//if condition 
			if (i!=num[i-1]) {
				System.out.println(i+ " missingnumber");
				break;
				}
			System.out.println(num[i]);
		}	
		
		
	}

}
