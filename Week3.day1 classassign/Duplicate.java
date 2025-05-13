package week3.day1;

import java.util.Iterator;

public class Duplicate {

	public static void main(String[] args) {

	 int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		System.out.println("Duplicate values are");
		
for (int i = 0; i < num.length-1; i++) {
	for (int j = i+1; j < num.length; j++) {
		if (num[i]==num[j]) {
			System.out.println(num[i]);
		}
	}
}
	}
}

	/*	int[] num1={2, 5, 7, 7, 5, 9, 2, 3};
		int[] num2={4, 8, 9, 6, 2, 1, 7, 5};
		System.out.println("Duplicate Values are");
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i]==num2[j]) {
				System.out.println(num1[i]);	
				}
			}
		}
		
	}
}
*/
