package day02variablesscanner;

public class Day02WrapperClasses {

	
	
	/*
	Wrapper Class: Non-Primitive classes have many useful methods but primitive classes do not. But having
	useful methods is very good
	
	Because of that, Java created new "Non-Primitive Data" types which have methods for primitive values.
	That new data types are called "Wrapper Classes"
	
	
	     Primitive Data      Wrapper Class
	         boolean            Boolean
	         char               Character
	         byte               Byte
	         short              Short
	         int                Integer
	         long               Long
	         float              Float
	         double             Double
	
	
	 */
	
	
	public static void main(String[] args) {
		
		boolean primitveBoolean = true;
		
		Boolean nonPrimitiveBoolean= true; 
		
		nonPrimitiveBoolean.equals(true); //true
		System.out.println(nonPrimitiveBoolean.equals(true));
		System.out.println(nonPrimitiveBoolean.equals(false));
		
		
		char c1= 'A';
		Character c2 = 'A';
		System.out.println(c2.charValue());  
		
		
		
		byte b1= 12;
		
		Byte b2 =12;
		
		System.out.println(b2.MAX_VALUE);
		System.out.println(b2.MIN_VALUE);
		
		
		
       short s1 = 123; 
       
       Short s2= 123; 
       Short s3= 120;
       System.out.println(s2.compareTo(s3)); // compareTo() method returns 0, if the numbers are equal to each other 
                                             // compareTo(s3) method returned -2 for 123 and 125, it means s2-s3
                                            //  compareTo(s3) method returned 3 for 123 and 120, it means s2-23
       
       
       Integer i1 = 1234; 
       System.out.println(i1.MIN_VALUE);
       
       Long l1 =12345L;
       
       System.out.println(l1.BYTES);  //8
       
       Float f1 = 1.34f; 
       
       System.out.println(f1.BYTES ); // 32 bits = 4 Bytes
       
       Double d1 = 23.567; 
       
      System.out.println(d1.MAX_VALUE);  // 1.7976931348623157E308

       
       
		
		

	}

}
