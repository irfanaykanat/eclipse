package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {

		// Using class name, we can access only static variables
		//
		System.out.println(Cars.numOfCars);
		
		
		// Using object name we can access instance variables
		Cars c1= new Cars();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		
		// using object name, we can access static variables
		// but it is not recommended
		System.out.println(c1.numOfCars);


		// Using class name, we can only access static methods
		
		System.out.println(Cars.engine());
		
		// Using object name, we can access instance methods
		c1.drive();  // I drive the car

		
		// Using object name you can access static methods 
		// But it is not recommended 
		System.out.println(c1.engine()); // The car has engine

		
		Cars c2= new Cars("Honda", "Civic", 2010, 8500);
		String vinC2=c2.creatVin(c2);
		System.out.println(vinC2);
		

	
		
		
	}

}
