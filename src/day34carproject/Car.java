package day34carproject;

/*
 * Q1) Can we create instance variables in abstract class? Yes
 * Q2) Can we create concrete methods in abstract classes? Yes
 * Q3) Can we create objects from abstract classes? No
 * 		Because by object we can reach methods and abstract methods do not have body, we get CTE
 * Q4) Can we crate construcotors in abstract classes? Yes 
 * O5) Constructors are to create objects. if we can not create object from abstract class, 
 * then what is the usage of Constructors in abstract classes  
 * 
 * 		i) To reach the instance variables of abstract class from concrete child classes 
 * 		ii)To assign values in instance variables using super constructor call with parameter
 * 			when we create an object from concrete child class
 * 
 * 
 *  Static Block: i) it runs only once when the class is loaded into memory
 *  			 ii) to initilalize static variables
 * 
 * 
 * 
 */



public abstract class Car {
	
	String make;
	String model;
	int year;
	double price;
	
	static {
		
		System.out.println("car is on the way");
	}
	
	
	public Car(String model, int year, double price) {
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public Car() {

	}
	
	
	abstract String carMake();
	abstract String carMOdel();
	abstract int carYear();
	abstract double carPrice();

	
	
	
	
	

}
