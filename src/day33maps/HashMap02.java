package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

	public static void main(String[] args) {
//		How to count the number of occurences of the letters (alphabetical characters) words 
//		in a sentence
//		  For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
//		         Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
		
		
		String str= "Java is easy. Type123 codes to learn Java. To earn money learn Java.";
		System.out.println(str);
		
		str = str.replaceAll("[^a-zA-Z]", "");

		System.out.println(str);// JavaiseasyTypecodestolearnJavaToearnmoneylearnJava

		
		
		String letters[]= str.split("");
		System.out.println(Arrays.toString(letters)); // [J, a, v, a, i, s, e, a, s, y, T, y, p, e, c, o, d, e, s, t, o, l, e, a, r, n, J, a, v, a, T, o, e, a, r, n, m, o, n, e, y, l, e, a, r, n, J, a, v, a]
		
		HashMap<String,Integer> resultMap= new HashMap<>();
		
		for (String w: letters) {
			
			
			Integer numOfOccurances = resultMap.get(w);
			
			if (numOfOccurances==null) {
				resultMap.put(w, 1);
				
			}else {
				resultMap.put(w, numOfOccurances+1);

			}
				
				
				
				
		}

		
		


		System.out.println(resultMap);
		
		
		

	}


	
}
