package day03scannerincrementdecrement;

import java.util.Scanner;

public class scanner02 {

	public static void main(String[] args) {
	
		// Task : Task: Type a program which calculates the area and the perimeter 
		// of a square whose side length is entered by user
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the length of the rectangle");
		double length = scan.nextDouble();
		
		System.out.println("Enter the witdh of the rectangle");
		
		double width = scan.nextDouble();

        System.out.println("The area of the rectangle "+ length*width);
        System.out.println("The perimeter:  " + 2*( length+width));
        
        scan.close();

        

	}

}
