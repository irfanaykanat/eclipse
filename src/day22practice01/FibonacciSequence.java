package day22practice01;

public class FibonacciSequence {

	public static void main(String[] args) {
		/*
	    Type a program that will print all Fibonacci Sequence on the console
	    0, 1, 1, 2, 3, 5, 8 etc.. create a number 
	     */

		int n =10; int firstTerm =0; int secondTerm =1;
		
		
		for(int i = 0 ;i<= n ; i++ ) {
			
			System.out.print(firstTerm+", ");//0, 1, 1,
			
			int nextTerm = firstTerm + secondTerm;//1, 2
			firstTerm = secondTerm;//1, 1
			secondTerm = nextTerm;//1, 2
			
			
			
			
		}
		
		
		
	}

}
