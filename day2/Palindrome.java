package week1.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		
int ip=212,revnum=0,rem;
int op=ip;

//for loop statement to check the condition
for (int i = ip; i > 0; i/=10) {

	rem=i%10;
	revnum=revnum*10+rem;
}

//if else statement
if(op==revnum) {
System.out.println(op+"is Palindrome");
}
else {
	System.out.println(op+"is not Palindrome");
} 
	}

}
