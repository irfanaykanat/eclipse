package day12variabletypesmethodoverloadingconstructors;
/*
 
 A class defines the types of objects that can be created from it. 
 It contains instance variables describing the object's data, 
 a constructor or constructors used to create it, and methods that define its behavior.
 
 
 
1) constructor is for creating object from a class
2) Every class has default constructor, default constructors are invisible.
3) when you create a constructor, Java removes the default
4) How to create our own constructor
		i) Type Access Modifier make it "public" most of the times
		ii) Type the class name
		iii) Open-close parenthesis
		iv) Open close curly branches
		5) Default Constructor is like; "public car(){}"
		
		note: Constructor name must be same class name
		
		
		        Car             c1         = new              Car()
		==> Class Name      Object Name    = new          Constructor
		
		
		6) Constructors do not have "return type" because Constructor are not methods. constructor are constructor
		7) Constructor name must be the same name with class name
		8) Constructor written in main method to obtain object
		
*/
    public class Car {
    	
    	String make;
    	String model;
    	int price;
    	int year;
	
        // Constructor can be overloaded as well
    	// Constructors are not methods!!! because they have not return type

	public Car() {             // Constructor
		
		this.make="Honda";
		this.model="Pilot";
		this.price=40000;
		this.year=2021;
		
		
	}
	
	public Car(String make,String model,int price,int year) {
		this.make=make;
		this.model=model;
		this.price=price;
		this.year=year;
		
		
	}
	
	public static void main(String[] args) {
		
	

	}

}
