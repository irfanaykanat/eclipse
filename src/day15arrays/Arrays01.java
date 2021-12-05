package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
    /*  Create an array, whose elements are "Ali", "Bekir", "Zehra", "Yasin", "Mary",
and then print the elements in alphabetical order on the console in different lines
 
 */
		
		String arr[]= new String[5];
		System.out.println(Arrays.toString(arr));// [null, null, null, null]
												// for char array we get just nothing [,,,]
		
		arr[0]="Ali";
		arr[1]="Bekir";
		arr[2]="Zehra";
		arr[3]="Yasin";
		arr[4]="Mary";
		
	    System.out.println(arr[0]);// Ali

		System.out.println(Arrays.toString(arr));// [Ali, Bekir, Zehra, Yasin, Mary]


		
		// How to write in a shorter way
		
		String  arr1[]= {"Ali", "Bekir", "Zehra", "Yasin", "Mary"};
		
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); // [Ail, Bekir, Mary, Yasin, Zehra]
		
		for (int i=0; i<=arr.length-1;i++) {
			System.out.println(arr1[i]);
			
		}

		// Print the element in reversed alphatecial order on the console in different lines 
		
		
		
		for (int i=arr.length-1; i>=0; i--) {

		
			System.out.println(arr1[i]);

		}
		
	}

}
