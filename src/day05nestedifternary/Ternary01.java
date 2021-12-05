package day05nestedifternary;

public class Ternary01 {

	public static void main(String[] args) {
		// If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
		
		// Fisrt way using if-else stucture
		int num=10;
		
		if (num>0) {
		System.out.println("The Integer is positive");

	    }else {
	    	System.out.println("The Integer is not positive");
	    }

		
		//2nd way 
		
		String result= num>0    ?    "The Integer is positive"   : "The Integer is not positive";
		System.out.println(result);
		
		// Write a program to print the minimum of 2 integers on the console. Use ternary..
		
		
		int num1=20;
		int num2=15;
		
		int min= num1< num2 ? num1 : num2;
		
		System.out.println(min +  " is minumum");
		
		// Write a program to print absolute value of an integer.
		// to get abs value of negative number, multiply by -1
		
		int  num3=-10;
	    int  abs= num3 >= 0 ? num3: -1*num3;
	    System.out.println(abs);
				
		

		

}
	}
