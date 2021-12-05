package day06nestedternerayswitchstringmanipulaton;

import java.util.Scanner;

public class Stringmanipulation01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str =scan.nextLine();
		
		// Print the first and last character of the given String "Java is easy"==>Jy
		// Last index will be 1 less then the number of character
		// str.length(); Returns the number of character
		
		
		
		char firstChar= str.charAt(0);
		char lastChar= str.charAt(str.length()-1);
		
		System.out.println(""+ firstChar+ lastChar);
		
		
		// Print the index of first occurance of 'a' if 'a' exists. Otherwise print
		// no 'a'
		
		int idx =str.indexOf("arn"); //Mac==> command + Hover over
		
		System.out.println(idx+ " is the index");
		
		// Note1: If you use non exist character in indexOf() method you will get -1 
		//every time
		
		//Note2: Index of methods works with char and works with String 
		//Note3: If you use multiple characters in index of() , it returns the index of first character
		//Note4: IndexOf() method works with first occurances every time
		if (idx==-1) {
			System.out.println("No 'a");
		}else {
			System.out.println(idx +" is the index");
		}
		
		
		
		//Print the index of last occurence of a specific character
		
		int lastIdx= str.lastIndexOf("ar");
				System.out.println(lastIdx);
		
		// Note1: if you use non-existing character in lastIndexOf() method, you will get -1 every time
		// Note: lastIndexOf() methods works with char and works with String
	    //Note3: If you use multiple characters in lastIndexOf() , it returns the index of first character
        // Note4: lastIndexOf() method works with last occurences every time
				
				
		// Check if a given character is unique in a String or not?
				
				
	    char c= 'v';		
	    
	    str.indexOf(c);
	    
	    int firstOccurancesIdx = str.indexOf(c);
	    int lastOccurancesIdx = str.lastIndexOf(c);
	    
	    if (firstOccurancesIdx==-1) {
	    	System.out.println(c +" does not exist inside the String");
	    }

	    else if (firstOccurancesIdx==lastOccurancesIdx) {
			System.out.println(c + " it is unique");
		}else 
			System.out.println(c+ " it is not unique");
		
	    
	    
	    
	    
	    // Get the initials of first name and last name of the user Ali Can ==>AC
	    
	    char initialOfFirstname= str.charAt(0);
	    char initialOfLastname= str.charAt(str.indexOf("")+1);
	    System.out.println(""+ initialOfFirstname+ initialOfLastname );
	    
	    
	    
	    
	    
	    // Get the character from index 3 to 7 from a String
	    String sub= str.substring(3, 8); // In Substring() method first index is inclusive, second index is exclusive
	    
	    
	    System.out.println(sub);
	    
	    // Get the character from index 3 to 7 from a String
	    
	    String sub2= str.substring(3, str.length());
	    
	    String sub3= str.substring(3);
	    
	    System.out.println(sub3);

	    
	    // Note: There are 2 substring() method. First one has 2 parameters, it is used to get a part of String
	    //from starting index (inclusive) to the ending index (exclusive)
	    //Second one has a single parameter, it is used to get a part of a String from starting index (inclusive) to the end 
	    
 
	    
	    /*
	     * String  shirtPrice =$12.99
	     * String  trouserePrice= $25.99
	     * Type code to calculate the sum of the shirt and the touser prices
	     */

	    
	    String  shirtPrice ="$12.99";
	    String  trouserePrice= "$25.99";
	    
	    String updatedShirtPrice = shirtPrice.replace("$", "").replace(".","");
	    String updatedtrouserePrice = trouserePrice.replace("$", "").replace(".","");
	    
	    System.out.println(Integer.valueOf(updatedShirtPrice)+ Integer.valueOf(updatedtrouserePrice));


	    
	    
	}
	    
	    
	

}
