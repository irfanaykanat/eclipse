package day32maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
		// Task: Print all entries of the hashMap hm1= {Ali=3, Veli=5, Can=7} 
		//on the console in different lines
		
		
		HashMap<String, Integer> hm1= new HashMap<>();
		hm1.put("Ali", 3);
		hm1.put("Veli",5);
		hm1.put("Can", 7);
		System.out.println(hm1); // {Can=7, Veli=5, Ali=3}
		
		
		// If you want to convert Map to a Collection use entrySet()
		Set <Map.Entry<String, Integer >> setOfEntries= hm1.entrySet();

		System.out.println(setOfEntries); // [Can=7, Veli=5, Ali=3]

		
		for (Map.Entry<String, Integer > w: setOfEntries) {
		System.out.println(w);
		}
		
	}

}
