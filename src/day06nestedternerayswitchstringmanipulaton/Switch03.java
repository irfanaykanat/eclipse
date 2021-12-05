package day06nestedternerayswitchstringmanipulaton;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
	
		
	/*
	 
	 Ask user to enter country among "Amarica, England, Germany, Turkey, India,
	  Peru, Spain, BUlgaria, Albania, France" Type code to print abbreviation of the countries.
	  "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
	 
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any county name from the list; {Amarica, England, Germany, Turkey, India,\n"
				+ "	  Peru, Spain, BUlgaria, Albania, France}");
		
		String country=scan.next().toLowerCase();
		
        switch(country) {
		case "amarica": 
			System.out.println("US");
			break;
			
		case "england": 
			System.out.println("UK");
			break;
			
		case "germany": 
			System.out.println("DE");
			break;
			
		case "turkey": 
			System.out.println("TR");
			break;
			
		case "india": 
			System.out.println("IN");
			break;
			
		case "peru": 
			System.out.println("PE");
			break;
			
		case "spain": 
			System.out.println("ES");
			break;
			
		case "bulgaria": 
			System.out.println("BG");
			break;
			
		case "albania": 
			System.out.println("AL");
			break;
			
		case "france": 
			System.out.println("FR");
			break;
			default:
				System.out.println("Select the country from the list");
			
		
			
}
	  scan.close();
		

	}

}
