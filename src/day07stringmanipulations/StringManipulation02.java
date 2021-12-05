package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		
		
		/* 1) Remove spaces from beginning and when user entered the name 
		 * 		String trimmedFullName= fullName.trim();
		 * 
		 * 
		 * 
		 * 2) Checks if the String is empty (No Character) String.
		 * 		boolean isTheStringEmpty= fullName.isEmpty();
		 *
		 * 3) Checks if the String is blank  String. (No Character or Space Character)
		 *     		boolean isTheStringBlank =fullName.isBlank();
		 *     
		 *     
		 * 4)str.length(); Returns the number of character
		 * 
		 * 
		 * 5)int idx =str.indexOf("a"); Print the index of first occurence of a specific character
		 * 
		 * Note1: If you use non exist character in indexOf() method you will get -1 every time
		 * Note2: Index of methods works with char and works with String 
		 * Note3: If you use multiple characters in index of() , it returns the index of first character
		 * Note4: IndexOf() method works with first occurances every time
		 * 
		 * 6) int lastIdx= str.lastIndexOf("ar"); Print the index of last Occurence of a specific character
		 * 
		 * Note1: if you use non-existing character in lastIndexOf() method, you will get -1 every time
		 * Note: lastIndexOf() methods works with char and works with String
	     * Note3: If you use multiple characters in lastIndexOf() , it returns the index of first character
         * Note4: lastIndexOf() method works with last occurences every time
         * 
         * 
         * 
         * 
         * 
         * 7)Get the initials of first name and last name of the user Ali Can ==>AC
         *                char initialOfFirstname= str.charAt(0);
         *                
         * 8) Get the character from index 3 to 7 from a String
         * String sub= str.substring(3, 8); // In Substring() method first index is inclusive, second index is exclusive
         *                
		 * 
		 * 
		 * Note: There are 2 substring() method. First one has 2 parameters, it is used to get a part of String
	     * from starting index (inclusive) to the ending index (exclusive)
	     * Second one has a single parameter, it is used to get a part of a String from starting index (inclusive) to the end 
	     *
		 * 
		 * 9) .replace("", "")  methods replaces first double quote with second quote
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *     
        */
		
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your full name...");
		
		String fullName=scan.nextLine();
		
		System.out.println(fullName);

		// 1) Remove spaces from beginning and when user entered the name
		
		String trimmedFullName= fullName.trim();
		System.out.println(trimmedFullName);
		
		
		
		// 2) Check if the String is empty (No Character) String.
		boolean isTheStringEmpty= fullName.isEmpty();
		System.out.println(isTheStringEmpty);

		// 3) Check if the String is blank  String. (No Character or Space Character)

		
		boolean isTheStringBlank =fullName.isBlank();
		System.out.println(isTheStringBlank);
		
		
		
		// Check the products if there is any product which has no price

	}

	
}
