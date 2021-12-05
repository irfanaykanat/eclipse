package day05nestedifternary;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		//
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a year");
		int year =scan.nextInt();
		
		if(year<=0) {
			
			System.out.println("Leap year must be positive");
			
		} else if(year%100==0 && year%400==0) {
			System.out.println("it is a leap year");
			
		} else if (year%100!=0 && year%4==0) {
			System.out.println("It is a leap year");
			
     	} else {
     		System.out.println("It is not a leap year");
     	}
		
		
		
		

	}

}
