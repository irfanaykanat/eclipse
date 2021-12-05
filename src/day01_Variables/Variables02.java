package day01_Variables;

public class Variables02 {
	
	/*
         Data Types in Java
         Note: In Java, there are 2 main data types 
         A) Primitive Data Types: 
         1)boolean: It has 2 different values which are "true" and "false"
                    Every boolean variable uses a single "bit" in memory
                    Booleans have "False" as default value
                    
         2)char   : It is used for single characters 
                    Value must be put between single quotes like 'S'
                    Every char uses 16 bits in memory
         3)byte 
         4)short 
         5)int 
         6)long 
         7)float 
         8)double
         
         Note: "=" is used to assign value to variable ( sadece deger atar ) 
               "==" is used to compare 2 values if they are equal to each other 
               "!=" means "not equal to"
               
         Note: If all values in an Integer the resukt will be Integer in Java
               If the result is decimal in Math, Java coverts the decimall to integer just by removing decimal part.
               Java do not make rounding operation       
         
         
         
         B) Non-Primitive Data Types 
         
	 */
	
	public static void main(String[] args) {
		
		boolean isExpensive = true;
		boolean isOld = false;
		boolean isRetired;
		
		char initialOfFirstName = 'S';
		char initalOfLastName = 'A';
		System.out.println(initialOfFirstName); // S
		System.out.println(initialOfFirstName +5); //88
		System.out.println(initialOfFirstName >5); // True
		System.out.println(initialOfFirstName ==5); // False
		System.out.println(initialOfFirstName !=5); // True

		System.out.println(initialOfFirstName > initalOfLastName); // True
		System.out.println(initialOfFirstName + initalOfLastName); //148
		System.out.println(initialOfFirstName / initalOfLastName); //1
		System.out.println(29/19);// 2.9==>2





		System.out.println(initialOfFirstName +" " +"5"); // S 5
		
		
		
		
		
		
		
		
		
	}

}
