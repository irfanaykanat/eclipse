package day10loops;

import java.util.Scanner;

public class WhileLoopTask02 {

	public static void main(String[] args) {
		// Type java code by using while loop.Write a program that types first 30 consecutive odd integers.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int Number= scan.nextInt();
		
		int i = 1;
		
		while (i<=Number) {
			
			if(i%2!=0) {
				System.out.println(i);

			
			}

			i++;
		}
		
		
		
		
		
		
		
		
		
	}

}
