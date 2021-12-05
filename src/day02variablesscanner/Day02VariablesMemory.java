package day02variablesscanner;

public class Day02VariablesMemory {

	public static void main(String[] args) {

		/*
	         Data Types in Java
	         Note: In Java, there are 2 main data types 
	         A) Primitive Data Types: 
	         1)boolean: it has 2 different values which are "true" and "false"
	                    Every boolean variable uses a single "bit" in memory
	                    Booleans have "False" as default value
	                    
	         2)char   : it is used for single characters 
	                    Value must be put between single quotes like 'S'
	                    Every char uses 16 bits in memory
	                    
	         3)byte   : it is used for "Whole numbers" between -128 and 127
	         if you are nor sure the value will between -128 between 127, do nor use byte data type
	         
	         4)short  : it used for whole numbers  between -32768 and 32767, it uses 16 bits 
	         	         if you are nor sure the value will between those values, do not use short data type

	         
	         
	         
	         5)int: it is used for "Whole numbers" between -2,147,483,648 ans 2,147,483,647
	                it uses 32 bit 
	                
	                
	         6)long: it is used for Whole numbers between -9,223,372,036,854,755,808 between -9,223,372,036,854,755,807
	                 it uses 64 bits from the memory 
	                 Note: Every whole number is "int" for Java as default. When you create a "long" variable, you have to put "L or l"
	                 to the end to inform Java, the number is not int it is long. Otherweise you get error. 
	                 for to inform Java we have to put "L"at the end of the variable
	                 
	                 
	                 
	         7)float : it is used "decimal Numbers" it uses 32 bits from Memeroy.
	                   Ever decimal numbers is "Double" for Java you have to put end "F or f " to the value 
	                   7 digits allowed 
	         
	         
	         
	         
	         8)double : Used for decimal values, Uses 64 bits of memory 
	         16 digits allowed more sensetive
	         
	         Note: "=" is used to assign value to variable ( sadece deger atar ) 
	               "==" is used to compare 2 values if they are equal to each other 
	               "!=" means "not equal to"
	               
	         Note: If all values in an Integer the resukt will be Integer in Java
	               If the result is decimal in Math, Java coverts the decimall to integer just by removing decimal part.
	               Java do not make rounding operation       
	         
	         
	         
	         B) Non-Primitive Data Types 
	         
	             String: It is used for multiple Characters
	         
		 */
		
		
		byte age = 12;
		System.out.println("Age: "+age); //12
		
		
		short populationOfAVillage = 2000;
		System.out.println("Population:" + populationOfAVillage );
		
		int profit = 200000000; 
		
		System.out.println("The Profit: $" + profit);
		
		
		long numberOfCellsInHuman = 56743891809727L;
		System.out.println(numberOfCellsInHuman );
				
		float f =1.2F;
		System.out.println("The Value: " + f);
		
		double d = 1.2897;
		System.out.println(d);
		
		
		String stdName = "Ali Can" ;
		System.out.println("Student name: " + stdName);
		
		System.out.println(stdName.toUpperCase());// ALI CAN
		
		
		System.out.println(stdName.toLowerCase());//ali can
		
		System.out.println(stdName.contains("i"));//True
		System.out.println(stdName.contains("x"));//false
		
	}

}
