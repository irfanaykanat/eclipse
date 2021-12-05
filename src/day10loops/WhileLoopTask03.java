package day10loops;

import java.util.Scanner;

public class WhileLoopTask03 {

	public static void main(String[] args) {
		
		
		// Task: Type java code by using while loop,
		//Write a program that prompts the user to input a positive integer.
		//It should then print the multiplication table of that number.
		
		 Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive Integer Number");
		int Number= scan.nextInt();
		
		
		
		int i=1;
		
		while (i<= 10) {
			
			System.out.print( i*Number+ " ");
			
			i++;
			
			
		}

		
		
		
		scan.close();
		
		
	}

}
