package day21accessmodifiersstringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// How to create StringBuilder object
		//1.way:
		
		
		StringBuilder sb1 = new StringBuilder(); // Gives you empty String Default character capacity is 16
		
		
		System.out.println("sb1 is:" + sb1);
		
		
		// Although i did not do assignemtn, oroginal value of sb1 is updatet to "Ali", it means 
		// StringBuilder
		sb1.append("Ali");
		System.out.println("sb1 is:" + sb1); // Ali
		
		sb1.append("Can");
		System.out.println("sb1 is:" + sb1);// Ali Can
		
	//	sb1.append(", how").append()

		
		
		//2.way:
		StringBuilder sb2 = new StringBuilder("Ali Can"); // Ali Can
		
		// Capacity will be 23 due to Ali Can + 16 space character (17+6=23)
		System.out.println("sb2 is:" + sb2);
		
		sb2.append(" went to scholl.");
		System.out.println("sb2 is:" + sb2); // sb2 is:Ali Can went to scholl.


		
		
		//3rd. Way:
		StringBuilder sb3 = new StringBuilder(9); // 9 is the character capacity of the StringBuilder

		
		sb3.append("1234"); 
		System.out.println("sb3 is:" + sb3); // sb3 is:1234

		sb3.append("56789"); 
		System.out.println("sb3 is:" + sb3); // sb3 is:123456789


		sb3.append("WoooW"); 
		System.out.println("sb3 is:" + sb3); // sb3 is: 123456789WoooW
		
		
		System.out.println(sb3.capacity()); //20
		
		
		
		
		
		
		
		
	}

}
