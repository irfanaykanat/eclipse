package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList02 {

	public static void main(String[] args) {
		// Task: How to check if a collection of given elements exist in a list
		//["A", "M", "C", "K", "B"] ==> Check if "A", and "C", and "K" exist in the list

		
		List<String>list1=new ArrayList<>();
		
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");

		System.out.println(list1);// [A, M, C, K, B]
		
		List<String>list2=new ArrayList<>();
		
		list2.add("A");
		list2.add("C");
		list2.add("K");
		
		System.out.println(list2);// [A C, K]
		// we use containsAll()to check if a list contains another list		
		
		System.out.println(list1.containsAll(list2));// true
		
		
		
		//2nd way
		
		// if you use asList(), be careful, the length will not be changed
		System.out.println(list1.containsAll(Arrays.asList("A","C","K")))  ; //true
		
		
		List<Integer>list3=Arrays.asList(3,4,6,8);
		
		//list3.add(9); not able to add or remove method in List due to fixed length
		
		
		// remove "C" and right "D" instead of it
		
		System.out.println(list1);// [A, M, C, K, B]
		
		int idxOfC= list1.indexOf("C");
		list1.remove(idxOfC);
		list1.add(idxOfC, "D");
		System.out.println(list1); // [A, M, D, K, B]
		
		// 2nd way, we use set (), to write a specific element 

		list1.set(idxOfC, "D"); // A, M, D, K, B]

	}

}
