package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		// Task 1: Type code to print unique characters on the console
		
		
		String s1= "Java";
		
		for(int i=0; i<s1.length(); i++ ) {
			
			char c=s1.charAt(i);
			
			if(s1.indexOf(c)==s1.lastIndexOf(c)) {
				
				System.out.println(c);
				
				
				
			}
			
		}
		
		
		// Task 2: Type code to find the sum of the integers from 12 to 24
		
		
		int sum=0;
		
		for (int i=12; i<15; i++) {
			
			sum= sum+i;
			
			
		}
		System.out.println(sum);
		
		
		// Task 3: Type code to find the product of the integers from 3 to 5
		
		
		
		
		int product =1;
		
        for (int i=3; i<6; i++) {
			
        	product= product*i;
			
			
		}
		System.out.println(product);
		
		// Task 4: A string is given. Create the String which is the reverse of the given String without spaces, then print it on the console
		// Example: Ali Can ===> nacilA
		
		// To catch a character from a string we have 2 methods either char method or substring method
		// Use substring method for task 4
		
		
		
	//	String s2= "Ali Can";
	//	String reversed= "";
		
		
	//	for ( int i= s2.length()-1; i>=0; i-- ) {
			
	//		char c=s2.charAt(i);
			
		
			
			
	//		if(c != ' ') {
	//			
	//			reversed = reversed +c;
	//		}
	//		System.out.println(reversed);

			
	//	}
	//	System.out.println(reversed);
		
		
		
		
	String s2 = "Ali Can";
    String reversed2="";    
    for( int i= s2.length()-1 ; i>=0 ; i-- ) {
        
        String ss=s2.substring(i, i+1);
        if( ! ss.equals(" ")    ) {
            reversed2=reversed2 + ss;
        }
        
        
        
        
   
                
    }
    System.out.println(reversed2);
		
		
		
		// Task 5: Type code to check if a given String is Palindrome.
       // String: anna ---------Reversed String: anna
      //  Integer: 12321 ------ Reversed Integer: 12321
    
    
    
    String s3= "anna";
    String reversedOfs3 = "";
    
    for(int i = s3.length()-1 ; i>=0  ;  i--  ) {
        
        reversedOfs3= reversedOfs3 + s3.charAt(i);
        
    }
    
    if(reversedOfs3.equals(s3)) {
        System.out.println(s3 + " is a palindrome");
    } else {
        System.out.println(s3 + " is not a palindrome");
    }
			
			
    
    
    
    // Task 6 : Type code to find the sum of the digits of an integer

    int sumOfDigits= 0; 
    
    
    for (int i= 12345;  i>0   ;  i=i/10   ) {
        System.out.println(i);

    	  
    	sumOfDigits = sumOfDigits+ i%10;
    	


        System.out.println(sumOfDigits);

    	
    }
    System.out.println(sumOfDigits);
    
    
    
    
    // Task 7 : Type code to find the sum of the unique digits of an integer.
    
    String num= "12234";
    int sum2=0;
   
    for ( int i=0; i<=num.length()-1;i++) {
    	
    	char c=num.charAt(i);
    	
    	if (num.indexOf(c)==num.lastIndexOf(c)) {
    		
    		String sn=""+c; //turning Integer to String
    		sum2=sum2+ Integer.valueOf(sn);
    		  
    		//Integer.valueOf(sn); Turns string nummer to integer
    		
    		
    	}
    	
    	
    	System.out.println(sum2);
    	
    	
    	
    }


	}

}
