package day11loops;

import java.util.Scanner;

public class DoWhileLoopHW06 {

	public static void main(String[] args) {
		/*  Ask user to enter a name.
			If the name contains the letter ‘a’ then print "Won!" on the console
			otherwise ask user to enter another name.
			Use do-while loop.		
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Name ");
		int counter=0;
		int i=0;
		do {
			String Name = scan.next();

			
			if (Name.charAt(i)=='a') {
				System.out.println("You won");
			}else {
				System.out.println("Try again");
			}
			
			counter++;
			
		}while(true);
		// scan.close(); Hata veriyor neden bilmiyorum?
	}
	
}
