package day11loops;

import java.util.Scanner;

public class DoWhileLoopHW05 {

	public static void main(String[] args) {
		/*  Ask user to enter a number
			If the number is divisible by 10 then print "Won!" on the console
			otherwise ask user to enter another number.
			Use do-while loop		
		 */

	
		Scanner scan= new Scanner(System.in);

	

		System.out.println("Enter an Integer...");

		
		
		do {
			
			int number=scan.nextInt();
			
			if (number %10==0) {
				
				System.out.println("You won");

			} else {
				
				System.out.println("Enter another number");
				
			}
		
			
		
		
		}while (true);
		
		
	}

}
