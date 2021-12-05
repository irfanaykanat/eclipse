package day06nestedternerayswitchstringmanipulaton;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// If you have many (more then 3) conditions, prefer to use switch instead of if-else-if
		
		//Task: Type code to print the day names when the day number is entered
		//1==> Sunday, 2==> Monday …. So on
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter day number...");
		
		int dayNumber =scan.nextInt();
		
		switch(dayNumber) {
		
			case 1: System.out.println("Sunday");
			break;  // berak takes you outside the switch statement
			case 2: System.out.println("Monday");
			break;
			case 3: System.out.println("Tuesday");
			break;
			case 4: System.out.println("Wedsnady");
			break;
			case 5: System.out.println("Thursday");
			break;
			case 6: System.out.println("Friday");
            break;
			case 7: System.out.println("Saturday");
			break;
			
			default:  // default is like "else" function
				System.out.println("I told you enter day number, what kind of user are you");
				break; //this break is optional
		
		}
  scan.close();

	}

}
