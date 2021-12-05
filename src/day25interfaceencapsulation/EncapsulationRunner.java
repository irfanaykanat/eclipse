package day25interfaceencapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {


//		Students std1 = new Students();
//		System.out.println(std1.getName());// Ali Can
//		std1.setName("Veli Han");
//		System.out.println(std1.getName());// Veli Han
//		System.out.println(std1.getGrade());//11
//		System.out.println(std1.isSuccessfull());// true
		
		
		// If you use following constructor all students will have same name 
		Students std2 = new Students();
		System.out.println(std2);
		
		// if you use following constructor, in every object creation you can create a different object
		Students std3 = new Students("Veli Han", 10, false);
		Students std4 = new Students("Kemal Can", 8, true);
		System.out.println(std3);
		System.out.println(std4);


//
//		   The best way; i) Create student object by using default constructor
//						ii) change the values by using setters then do whatever you want
		
		Students std5 = new Students();
		std5.setName("Ayse Han");
		std5.setGrade(7);
		std5.setSuccessfull(true);
		System.out.println(std5);


		// now save the student into date base
		
		
		std5.setName("Mary Star");
		std5.setGrade(12);
		std5.setSuccessfull(false);
		System.out.println(std5);

		
	}

}
