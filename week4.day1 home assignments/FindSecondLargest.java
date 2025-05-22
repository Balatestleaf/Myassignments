package week4.day1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
	
	//given input	
		Integer[] a = {3, 2, 11, 4, 6, 7};
		
	//given values in list
		List<Integer> x=Arrays.asList(a);
		
	//sorting the values using collections
		Collections.sort(x);
		
	//second large number using get method
		Integer secondlarge = x.get(x.size()-2);
		
	//print the ouput
		System.out.println("second largest number : "+secondlarge);

	}

}
