package day29exceptions;

public class Exception01 {

	public static void main(String[] args) {
		try {
			checkGrade(200);
		} catch (IllegalGradeException e) {
		
			System.err.println(e.getMessage());
		//	e.printStackTrace();
		}
	}

	
	
	public static void checkGrade(int grade) throws IllegalGradeException {
		if (grade<0 || grade>100) {
			throw new IllegalGradeException ("Do not make the grade less than 0 or gretaer then 100 ");
		}else {
			
			System.out.println("Your grade is "+ grade );
		}
		
	}
	
}




// Create Custom Compile Time Exception

/*
 * 1) You have to extend exception class  "extend Exception class"
 * 2)To be able to put "exception message" on the console, you should create construcotr
 *  with String parameter like "Public IllegalGradeException(String message)"
 *  3) inside the constroctoe call parent constroctor with message argument like "super(message)"
 *  4) After creating your own exception class you can use it in any method body whenever 
 *  you need by typing like "throw new IllegalGradeException ("Do not make the grade less than 0 or greater then 100 ")"
 *  
 * 
 */
  class IllegalGradeException extends Exception{
	
	public IllegalGradeException (String message) {
		super(message);
		
		
		
	}
	
	
}