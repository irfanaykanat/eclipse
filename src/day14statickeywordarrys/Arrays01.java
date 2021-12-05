package day14statickeywordarrys;

import java.util.Arrays;

/*
 *         Arrays: 1) Arrays are to store multiple data in a single container
 *         		   2) All the data in array must be same
 *         		   3) Arrays can accept only "primitives" and "references" as element
 *         		      Arrays can't accept non-primitives as data type
 *         	       4) Array itself is non-primitive data type
 */

public class Arrays01 {

	
	
	public static void main(String[] args) {
		
		
		// How to create array
		int arr1 []= new int[4]; //possible creation int[] arr1, int[]arr1=new int[4]; possible bracket positions
		
		// How to print on the console
		System.out.println(arr1);  // It turns the adresses of the array [I@70dea4e
		
		System.out.println(Arrays.toString(arr1));
		
		
		// How to add elements in a array
		
		arr1[0]=4;
		System.out.println(Arrays.toString(arr1));
		arr1[0]=4;
		arr1[1]=3;
		arr1[2]=2;
		arr1[3]=10;
		System.out.println(Arrays.toString(arr1));

		
		// How to print a specific element on the console
		System.out.println(arr1[0]);//4
	//	System.out.println(arr1[4]); // Index 4 out of bounds for length 4
									// no red underline, not compile time error
		
		
		// How to get the number of elements in array
		
		System.out.println(arr1.length);
		
		// How to get the last element 
		System.out.println(arr1[arr1.length-1]);//son karakterin degeri 8
		
		
		// How to put elements in ascending order
		
		Arrays.sort(arr1);	// sort() updates array
		System.out.println(Arrays.toString(arr1));
		
		// How to print smallest element on the console
		// Firstly sort array and then call index "0"
		
		System.out.println(arr1[arr1[0]]);
		
		// How to print biggest element console
		System.out.println(arr1[arr1.length-1]);
		
		// Create a String element put "Ali", "Veli", "Mete", "Can" as element 
		//sort the element
		// find the last element after sort() method
		
		System.out.println(Arrays.toString(arr1));
		
		String arr2[] = new String [4];
		System.out.println(Arrays.toString(arr2));
		
		arr2[0] = "Ali";
		arr2[1] = "Veli";
		arr2[2] = "Mete";
		arr2[3] = "Can";
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);	
		
		System.out.println(Arrays.toString(arr2));
	
	}

}
