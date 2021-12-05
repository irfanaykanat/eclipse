package day11loops;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		Task:  For the String “1234_?!abcdef”, type a code to count the number of letters,
			 the number of digits and the number of others by using do-while loop
		 */
		
		String s= "1234_?abcdef";
		
		//1. Way using by do-while loop
		int digitCounter=0;
		int letterCounter=0;
		int otherCounter=0;
		int index=0;

		do {
			if(s.charAt(index)>='a' && s.charAt(index)<='z') {
				letterCounter++;
				
			}else if (s.charAt(index) >='0'  && s.charAt(index)<='9')
				digitCounter++;
			else {
				otherCounter++;
			}
			index++;
			
		} while(index<s.length());
		
		System.out.println("Letters: "+ letterCounter);
		System.out.println("Digits: "+ digitCounter);
		System.out.println("Others: "+ letterCounter);

		
		
		
		
		// 2.way 
		
		String t= "A5b!";
		
		String justDigits=t.replaceAll("[^0-9]", "");
		System.out.println("Nnmber of digits:" +justDigits.length());
		
		String justLetters=t.replaceAll("[^a-zA-Z]", "");
		System.out.println("Nnmber of digits:" +justLetters.length());
		
		String diffFromLettersAndDigits=t.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Nnmber of others:" +diffFromLettersAndDigits.length());


		
		
	}

}
