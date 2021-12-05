package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		// 1. Example: Get a number from user. If the number is even, print "even" on the console
		// if (it rains) no picnic tomorrow in Java
		//
		//
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		int num1=scan.nextInt();
		
		System.out.println("Enter second number");
		int num2=scan.nextInt();


		
		
		
		if(num1%2==0) {
			
			System.out.println("Even");
		}
		
		// 2. Example Get a number from user. If the number is odd, print "Odd" on the console
		
        if(num1%2!=0) {
			System.out.println("Odd");
		}
        
        // Get two numbers from user, If they are equal to each other, print "Equal" on the console
		
        
        
        if(num1==num2) {
			System.out.println("Equal");
		}
        
        

	}

}
