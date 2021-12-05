package practice6;

import java.util.TreeMap;

public class SortKeySetsOfMap {
	
	public static void main(String[] args) {
		/*
		 * "a"  "One"
		 * "b"  "Two"
		 * "d"  "Four"
		 * "c"  "Three
		 * Sort the elements using Map
		 */
		
		
		
        TreeMap<String, String> tm1 = new TreeMap<>();
        
        tm1.put("a", "one");
        tm1.put("b", "Two");
        tm1.put("d", "Four");
        tm1.put("c", "Three");
        
        System.out.println(tm1);

	}
}