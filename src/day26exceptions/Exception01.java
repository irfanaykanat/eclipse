package day26exceptions;

/*
 * 1) Exception: unexpected issues 
 * 2) When there is an exception
 * 		i) java throws exception
 * 		ii) java stops executiong the rest of the codes
 * 3) we can handle exceptions using try-catch blocks 
 * 4) try blocks can't be used alone, there must be catch or some other blocks
 * 5) THERE CAN BE MULTIPLE CATCH BLOCKS AFTER TRY BLOCKS 
 * 6) if there is no parent child relation between exceptions classes 
 * 	   i)then the order of catch blocks is no important 
 * 	   ii) if there is parent child  exceptions relationship the order is important then 
 *         the child class exception must be first
 */

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(division(12,4));
		System.out.println(division(8,1));
		System.out.println(division(0,5));
		System.out.println(division(5,0));
		System.out.println(division(20,0));
		System.out.println("--------------------------");
		
		int arr[]= {4,2,5,6,7};
		
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 0));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 1));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 2));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 3));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 4));

		System.out.println("--------------------------");
		
		int brr[]= {12,4,2,0,5};

		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 0));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 1));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 2)); // java.lang.ArithmeticException:
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 3));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 4));




	}
	
	
	public static double division(int a, int b) {
		double result =0;
		
		try {
			
			result= a/b;
			
		}catch(ArithmeticException e) {
			
			System.out.println("do not divide by zero: " + e.getMessage());
		}
		  return	result;

		
	}
		
	
	public static int arraySumOfTwoConsecutiveElements(int arr[], int index) {
		int result=0;
		
		try {
		
		result= arr[index]+ arr[index+1];
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("do not use non-existing index " + e.getMessage());
		}
		
		return result;

	}
	
	
	    public static double arrayDivisionOfTwoConsecutiveElements(int arr[], int index) {
		double result=0;
		
		try {
		
		result= arr[index]/ arr[index+1];
		
		}catch(ArithmeticException e) {
			
			System.out.println("do not divide by zero " + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("do not use non-existing index: " + e.getMessage());
		}
		
		return result;
		
		
		
		

	}
	
	
	

}
