package day10loops;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {
		/*
		 
		  
		  Ask user to enter the number of rows to create following image
                    if user gives you 4;
                                          A1
                                          AB2
                                          ABC3
                                          ABCD4
		  
	
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows= scan.nextInt();
		
		int  i=1;
		char c='A';
		
		while (i<=rows) {
			
			
			
			for(int j=1; j<=i; j++) {
				
				
				System.out.print(c);
				c++; // print the next letter it increase by one letter just numbers 

			}
			c='A';
			System.out.println(i);
			i++;
		}
		
		
		
		
		
		
	}

}
