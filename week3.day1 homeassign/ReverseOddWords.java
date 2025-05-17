package week3.day1;

public class ReverseOddWords {
public static void main(String[] args) {
	// given line	
		String Givenline="I am a software tester";
	//reversewords
		String result=reverseWords(Givenline);
		System.out.println(result.substring(1));	
	}
	private static String reverseWords(String string) {
			//split words
		String[] str=string.split(" ");
		String r="";
		//for loop for each word
		for (int i = 0; i < str.length; i++) {
			if (i%2==1) {
				str[i]=reverse(str[i]);
				}
			r=r+""+str[i];
		}
		return r;
	}
	public static String reverse(String string1) {
	String rev="";
	
	//for loop
	for (int i = string1.length()-1; i>=0 ;i--) {
			rev=rev+string1.charAt(i);
		
	}
		return rev;
		
	}
	
	
}

