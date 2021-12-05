package day03scannerincrementdecrement;

import java.util.Scanner;

public class InterviewQuestions01 {

	public static void main(String[] args) {
		// Swapping two numbers: 
		
	// Get two numbers from user then swap/exchange them.
	//	User ==> a=5, b=10, then after swapping a=10, b=5.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int firstNumber= scan.nextInt();
		
		System.out.println("Enter the second number");
		
		int secondNumber= scan.nextInt();
		
		System.out.println("Before Swap, The first Number : firstNumber " +firstNumber+ " The second Number: "+ secondNumber);

		
		
		// first way 
		
		//int temp=0;
		
		//temp= firstNumber;
		//firstNumber= secondNumber;
		//secondNumber=temp;
		
		//System.out.println("After Swap, The first Number : firstNumber " +firstNumber+ " The second Number: "+ secondNumber);
		
		
		
		// 2nd Way
		
		firstNumber = firstNumber+ secondNumber;
		
		secondNumber= firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		
		
		
		System.out.println("After Swap, The first Number : firstNumber " +firstNumber+ " The second Number: "+ secondNumber);
		

		scan.close();
		
		

	}

}
