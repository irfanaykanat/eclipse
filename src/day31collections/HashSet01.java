package day31collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*1) "Set" is to store unique elements 
 *2) "hashing" means to create a unique integer (hesh code) for each object in the collection
 *3) "Hashset" is to store unique elements in random order.
 *4) "Hashset" is fast since it does not put elements in an order
 *5) "Hashset" accepts "null" as element
 * 
 * 
 */

public class HashSet01 {

	public static void main(String[] args) {

		
		HashSet<String> hs1= new HashSet<>();
		hs1.add("A");
		hs1.add("A");
		System.out.println(hs1);// [A]
		
		hs1.add(null);
		hs1.add(null);
		System.out.println(hs1); // [null, A] hashset put it without order


		
		HashSet<String> hs2= new HashSet<>();
		hs2.add("A");
		hs2.add(null);
		System.out.println(hs2);// [A]
		
		
		// equals() does not check the order of elements for HasHSet
		System.out.println(hs1.equals(hs2));//true
		
        //	 there is no remove() method, since the first element is not certain
		
		System.out.println(hs1.remove(null));// true
		
		
		System.out.println(hs1.remove("B"));// false
		
		
		//Interview Question: Type a code to display ArrayList elements just once in random order
		//Example: [5, 3, 6, 1, 5, 6, 7] ===> [3, 6, 5, 7, 1]
		
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
        System.out.println(list); // [5, 3, 6, 1, 5, 6, 7]
        
        
		HashSet<Integer> hs3= new HashSet<>();
		hs3.addAll(list);
		System.out.println(hs3);


	}

}
