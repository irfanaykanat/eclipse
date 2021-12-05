package day07stringmanipulations;

public class StringManipulation01 {

	public static void main(String[] args) {
		
		
	/* 
	 * Task: Type code to find the number of space characters in a String
	 * 
	 * Regex (Regular Expression): Regex is used to declare a group of characters
	 * i) All lower case letters ==> [a-z]
	 * ii) All upper case letter==> [A-Z]
	 * iii) All upper case lower case letters==> [a-zA-Z]
	 * iv) All characters different from space character ==> \\S
	 * v) Space character ==> \\s
	 * vi)All characters different from digits  ==>\\D
	 * vii) All digits   ==>\\d
	 * viii) Non alphatecial characters ==> [^a-zA_Z] // ^ meaning is not
	 * ix) Characters from a to z, from A zo Z, and from 0 to 9 and _ (under score)==> "\\w"
	 * x) Characters different from a to z, from A zo Z, and from 0 to 9 and _ (under score)==> "\\W"
	 */
		
		
    String s1= "Ali went to school.";
    
    //String updateds1= s1.replaceAll("[a-z]", "").replaceAll("[A-Z]", "");
    String updateds1= s1.replaceAll("\\S", "");

    
    System.out.println(updateds1);
    
    /*
     * Task 2) Type code to find the number of characters different from space character
     * 1.Way : Number off all characters- Number of Scpace characters = Number of characters 
     * different from space character 
     * 
     * 2.Way : Find the charaters different from space directly 
     */
		
    
    
    int numfCharsDiffFromSpace= s1.length()- updateds1.length();  //first way
    String updated2s1 = s1.replaceAll("\\s", "");
    
    System.out.println(updated2s1.length());
		
		
		
		
	/*
	 *  Task 3==> Type code to find number of digits , number of letters, and characters 
	 *  different from digits and letters
	 */
		
		String s2= "Ali Can:1234567890  !!!! ?.";
		
		String updates2= s2.replaceAll("\\D","" ); // "\\D" and "[^0-9]" having the same meaning
		System.out.println(updates2);
		
		String updates2s2= s2.replaceAll("[^a-zA-Z]","" );
		System.out.println(updates2s2);

		String updates3s2= s2.replaceAll("[a-zA-Z0-9]","" );
		System.out.println(updates3s2);
		System.out.println(updates3s2.length());

		
		
		/*
		 4)Check the password according to the given rule
	a)No space character at the beginning and at the end
	b)It must contain at least 1 digit
	c)It must contain at least 1 lowercase letter
	d)It must contain at least 1 uppercase letter
	e)It must contain at least 1 character different from digits and letters 
		 * 
		 */
		
		
		 String pwd = "123Abc";
	        
	        boolean isFirstCharSpace = pwd.startsWith(" ");
	        System.out.println(isFirstCharSpace);
	        
	        boolean isLastCharSpace = pwd.endsWith(" ");
	        System.out.println(isLastCharSpace);//false
	        
	        int numOfDigitChars = pwd.replaceAll("\\D", "").length();
	        
	        int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", "").length();
	        
	        int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", "").length();
	        
	        int numOfCharsDiffFromLetterAndDigit = pwd.replaceAll("[a-zA-Z0-9]", "").length();
	        
	        if(isFirstCharSpace) {
	            System.out.println("Your password is invalid. Do not use space at the beginning.");
	        }
	        if(isLastCharSpace) {
	            System.out.println("Your password is invalid. Do not use space at the end.");
	        }
	        if(numOfDigitChars==0) {
	            System.out.println("Your password is invalid. Use at least 1 digit.");
	        }
	        if(numOfLowerCaseChars==0) {
	            System.out.println("Your password is invalid. Use at least 1 lowercase letter.");
	        }
	        if(numOfUpperCaseChars==0) {
	            System.out.println("Your password is invalid. Use at least 1 upercase letter.");
	        }
	        if(numOfCharsDiffFromLetterAndDigit==0) {
	            System.out.println("Your password is invalid. Use at least 1 character different from letters and digits");
	        }

	}
}
