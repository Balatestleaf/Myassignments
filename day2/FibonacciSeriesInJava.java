package week1.day2;

public class FibonacciSeriesInJava {

	public static void main(String[] args) {
		 int a=0, b=1, inputrange=8;
		//for loop statement 
		 for (int i = 1; i <=inputrange; i++) {
			 System.out.println("Fibonacci Series values"   +a);
			 a+=b;
			 b=a-b;
			 
		}
		
		}
		

	}


