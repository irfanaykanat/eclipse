package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(17%5); //2
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int bigNum=scan.nextInt();
		System.out.println("Enter the second integer smaller then the first integer");
		int smallNum= scan.nextInt();
		
		
		int width =bigNum% smallNum; // remainder 
		int length= bigNum+smallNum;// addition
		
		System.out.println("The area:"+ width*length);
		System.out.println("The perimeter:"+ 2*(width+length));

		
		
		
		
		
	}

}
