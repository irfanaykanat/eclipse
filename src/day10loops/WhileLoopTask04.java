package day10loops;

import java.util.Scanner;

public class WhileLoopTask04 {

	public static void main(String[] args) {
		
		
		//Type java code by using while loop,
		//Write a program to count the factors of an integer which is entered by user.
		
		
		    Scanner scan = new Scanner(System.in);
			System.out.println("Enter a Number");
			int Number= scan.nextInt();
			
			int i= 1; 
			
			while (i<=Number) {
				
				if (Number%i==0) {

					

					System.out.println(i);
				}
				i++;
			}
		
		
		
		
		
		
		
	}

}
