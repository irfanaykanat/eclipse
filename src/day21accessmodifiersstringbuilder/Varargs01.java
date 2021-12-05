package day21accessmodifiersstringbuilder;

public class Varargs01 {

	public static void main(String[] args) {
		
		
		add();
		
		System.out.println("The Sum is: " + add());//0
		System.out.println("The Sum is: " + add(7));//7
		System.out.println("The Sum is: " + add(7,9));//16
		System.out.println("The Sum is: " + add(7,9,17,89,-7,78));//193
		
		
		
		
		System.out.println(join('a','l','i'));// ALİ


	}

	
	
	
	
	// add method olusturduk varrag ile
	
	public static int add(int...a) {
	
		int sum=0;
		for (int w:a) {
			
			sum =sum+w;
			
		}
	
		return sum;
		
	}
	
	
	/*
	 1) in a method , you can not use multible varargs 
	 2) in a method after the varargs you cannot use any other parameters. 
	    So varargs mut be the last parameter
	   
	 3) Before the varrgs you can put many paramters, no limitations
	  
	 */
	
	public static String join(char...c) {
		
		String name= "";
		for (char w:c) {
			
			name =name +w;
			name=name.toUpperCase();
		}

		return name;
	}

	
	
	
	
	
	
	
	
	
	
}
