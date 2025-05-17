package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String text1, String text2) {
		
	//the strings to character arrays	
		char[] text1Array = text1.toCharArray();
		char[] text2Array = text2.toCharArray();
		
	//Sort both the character arrays
		Arrays.sort(text1Array);
		Arrays.sort(text2Array);
		
	//sorted arrays are compared
		return Arrays.equals(text1Array, text2Array);	
	}
	
	public static void main(String[] args) {
		
	//input two strings
	String text1 = "stops";
	String text2 = "potss";
	
	//using if sorting arrays
	if (anagram(text1,text2)) {
		System.out.println(text1 + "and" +text2 + "The given strings are Anagram");
	}else {
		System.out.println(text1 + "and" +text2 + "The given strings are not an Anagrams");
	}
	}
	}


