package day17foreavhloopmultidimensionalarry;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Task: Print the elements which have "a" from a 2 dimensional String array
		
		String arr1[][]={ {"learn","java", "it"},   {"is", "easy"}  };
		
		for (String []w :arr1) {
			
			for (String x:w) {
				
				if(x.contains("a")) {
					System.out.print(x + " ");
				}
				
				
			}
		}
		
		
		
		
		//Task (Homework): Convert a 2 dimensional array to 1 dimensional array, Such as
		
		//int arr2[][]= {{1,2},{3,4,5},{6,7,8,9}};
				
	//	int arr []	= {1,2,3,4,5,6,7,8,9,19};	
		
		
		int arr2[][] = { {1,2}, {3,4,5}, {6, 7, 9, 10} };
		int arr[]= new int[arr2[0].length+arr2[1].length+arr2[2].length];
		
		int value =0;
		for(int[] y : arr2) {
			for (int x : y) {
				arr[value]= x;
				value++;
			}
			}
		System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
	}


