package day10loops;

import java.util.Scanner;

public class WhileLoopTask05 {

	public static void main(String[] args) {
		
		
		//Type java code by using while loop,
		//Write a program that prompts the user to input an integer. 
		//It should then find sum of the digits of that number.
		
		
		    Scanner scan = new Scanner(System.in);
			System.out.println("Enter an Integer Number");
			int num= scan.nextInt();
			
			int sum= 0; 
			
			while (num !=0) {
				sum= sum+ num%10;
				num=num/10;
				System.out.println(sum);
				
				
			}
			
			System.out.println(sum);

		
		
		
		
	}

}
