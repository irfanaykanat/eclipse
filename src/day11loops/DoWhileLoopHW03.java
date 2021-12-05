package day11loops;

import java.util.Scanner;

public class DoWhileLoopHW03 {

	public static void main(String[] args) {
		/*
 		Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
 		by using do-while loop.		
		
		 */

	
		
		int number =1;
		
		do {
			
			
			if(number %5==0) {
			
			System.out.println(number);
			}
			number++;
			
		}while (number<101);
		
	}

}
