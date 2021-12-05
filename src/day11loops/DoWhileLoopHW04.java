package day11loops;

import java.util.Scanner;

public class DoWhileLoopHW04 {

	public static void main(String[] args) {
		/*
 		     Write a program to print letters from c to m on the console by using do-while loop.		
		
		 */

	
		
		char letters ='c';
		
		do {
			
			
			if(letters <'n') {
			
			System.out.print(letters+  " ");
			}
			letters++;
			
		}while (letters<'n');
		
	}

}
