package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
public static void main(String[] args) {
		
	//input company names 
		String[] Companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	//Array list	
		List<String> IT = new ArrayList<String>();
		
	//add 
		IT.add("HCL");
		IT.add("Wipro");
		IT.add("Aspire Systems");
		IT.add("CTS");
		
	//collections
		Collections.sort(IT);
	
	//for loop 
		for (int i =IT.size()-1; i>=0; i--) {
			System.out.print(" "+IT.get(i));
			if(i!=0);
			System.out.print(" ");
		}

	}

}
