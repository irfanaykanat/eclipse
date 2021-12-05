package day34carproject;

public class Honda extends Car {

	String make= "Honda";
	String model= "Accord";
	int year=2012;
	double price= 8000;
	
static {
		
		System.out.println("car is on the way");
	}
	
	
	@Override
	String carMake() {
		return this.make;
	}
	
	
	public Honda() {
	}
	
	
	public Honda(String model, int year, double price) {
		super( model,  year,  price);
		this.model = model;
		this.year = year;
		this.price = price;
	}

	
	

	@Override
	String carMOdel() {
		return this.model;
	}
	@Override
	int carYear() {
		return this.year;
	}
	@Override
	double carPrice() {
		return this.price;
	}
	
	
}
