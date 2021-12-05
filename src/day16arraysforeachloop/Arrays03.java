package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
	
	// Check if a specific element exist in an array

	public static void main(String[] args) {
		int expectedElement=12;
		int counter=0;
		
		
		//1. way
		int arr []= {12,21,34,12};
		
		for (int i=0; i<arr.length; i++) {
			
			if (expectedElement== arr[i]) {
				counter++;
				break;
				
			}
		}
		if (counter==1) {
			System.out.println(expectedElement + "exist in the array.");
		}else {
			
			System.out.println(expectedElement + "does not exist in the array.");

		}
	
		
		
		//2.way
		// a) binarySearch() returns the index of expected element if the element exist
		// b) binarySearch() returns negative integers for non-existing elements. 
		//    The value represents the order number  if the element exist
		// c) Before using binarySearch()  method you have to use sort() otherwiese the output you got
		//    have any meaning
		// d) inarySearch() does not give stable outputs for repeated values
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, expectedElement));
	}

}
