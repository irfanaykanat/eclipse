package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
 * How to count the number of occurences of the words in a sentence
   For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
                 Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
   
 */
public class HashMap01 {

	public static void main(String[] args) {

		String str= "Java is easy. Type codes to learn Java. To earn money learn Java.";
		System.out.println(str);
		// According to Java and Java. are different words but in our Task they should be same 
       //		because of that i need to remove all pubction marks
		
		//"to" and "To" are different for Java but in my task they should be same
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		System.out.println(str);

		String word[]= str.split(" ");
		System.out.println(Arrays.toString(word));
		
		
		HashMap<String,Integer> result= new HashMap<>();
		
		
		for (String w: word) {
			
			Integer numOfoccurance = result.get(w);
			
			
			// if the word does not exist in map if body will be executed
			if (numOfoccurance==null) {
				
				result.put(w, 1);
				
		  // if the word does not exist in map if body will be executed
	
			}else {
				
				result.put(w, numOfoccurance+1);

				
			}
			
		}
		System.out.println(result); // {codes=1, java=3, money=1, learn=2, earn=1, is=1, to=2, type=1, easy=1}


	}

}
