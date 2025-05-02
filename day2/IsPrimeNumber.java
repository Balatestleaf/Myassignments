package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
	int num=13;
	int n=0;
	
	System.out.println("Given Number is:"+num);
	//for loop statement to check the condition
	for (int i = 1; i <=num; i++) {
		if (num%i==0) {
			n++;
		}
	}
	// if else statement
    if (n==2) {
	System.out.println(num +"Is a Prime Number");
    } else {
	System.out.println(num +"Is not a Prime Number");
   }
	   }

     }

