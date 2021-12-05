package day18multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// disadvantege of Array is that the length of array must be declared at the beginning 
		// and cant be changes. If the length is 100, you cant ass 101st element or more than 100 elements
		
		/* 1) The length of Arraylist is "flexible"
		 * 2) ArrayList can store only non-primitve data-types
	
		 */
		
		// How to declare ArrayList
		//1st way
		
		ArrayList<Integer> list1= new ArrayList<>();
		
		
		// 2nd way 
		
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		// 3rd way recommended
		
		List<Integer> list3= new ArrayList<>();
		
		System.out.println(list3);
		
		// How to add elements 
		// The order of elements is the order of insertion
		
		list3.add(5);
		list3.add(8);
		list3.add(3);
		System.out.println(list3); //[5, 8, 3]

		
		// How to add an element in a specific index
		list3.add(1,10); //[5, 10, 8, 3]

		System.out.println(list3); //[5, 8, 3]
		System.out.println(list3.add(20)); //true
		
		list3.add(1, 100);
		System.out.println(list3);// [5, 100, 10, 8, 3, 20]

		
		// How to get the length of list
		System.out.println(list3.size());//5
		
		// How to check a list is empty
		System.out.println(list3.isEmpty());// false
		System.out.println(list1.isEmpty());// true
		
		// How to check if there is a specific element
		list3.contains(100);
		System.out.println(list3.contains(100)); // true
		System.out.println(list3.contains(0)); // false

		// How to remove a specific element from list 
		list3.remove(0);//remove element in index 0
		System.out.println(	list3.remove(0));  // 5 it turns the removed element

		
		
		System.out.println(list3);
		
		
		List<String> list4= new ArrayList<>();
		list4.add("Ali Can");
		list4.add("Veli Han");
		list4.add("Kemal Efe");		
		
		list4.remove(0);
		System.out.println(list4); // Veli Han, Kemal Efe]
		
		// In string list, we can write the string element inside remove () and remove thet element
		
		list4.remove("Veli Han");
		System.out.println(list4);//[Kemal Efe]);

		
		
	}

}
