package week3.day1;

public class FindIntersection {
		
public static void main(String[] args) {
	
//declaring array1 and array2
	int a[]={3,2,11,4,6,7};
	int b[]={1,2,8,4,9,7};

//nested for loop a and b	
		for (int i = 0; i < a.length; i++) {
	
			for (int j = 0; j < b.length; j++) {
//check for condition using if			
				if (a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
