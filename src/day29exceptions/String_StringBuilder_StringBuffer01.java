package day29exceptions;

public class String_StringBuilder_StringBuffer01 {
	/*
	 * 1) StringBuffer and StringBuilder are mutable classes
	 * 2) StringBuffer (Java1) is created before StringBuilder (Java 5) in java
	 * 3) StringBuffer is thread-safe and synchronized class, but 
	 * StringBuilder is not thread-safe and synchronized class
	 * 
	 * 
	 */
	
	

	public static void main(String[] args) {

		StringBuffer sbr1= new StringBuffer();
		
		System.out.println(sbr1.capacity());//16
		
		
		StringBuffer sbr2= new StringBuffer("Java");
		System.out.println(sbr2.capacity());//20
		

		StringBuffer sbr3= new StringBuffer(7);
		System.out.println(sbr3.capacity());//7
		
	     sbr3.append("Java");//7
	     
	     sbr3.append("is good");//7*2+2=16
		


	}

}
