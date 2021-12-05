package day25interfaceencapsulation;

public class Runner {

	public static void main(String[] args) {
		Car car1= new Car();
		car1.bacteriaKiller();
		car1.climateAC();
		car1.electronicAC();
		car1.havingHbridEngine();
		
		// when you use default keyword to create concrete method in an interface, you can call the method 
		// just by using object name, by using interface names you can not access to the methods 
		car1.move();
		
		// when you use static keyword to create concrete method in an interface, you can call the method 
		// just by using interface name, by using object names you can not access to the methods 
		Vehicle.staticMove();
		
		System.out.println(AirCondition.MAKE);// Samsung
		
		System.out.println(HybridEngine.MAKE);// Honda Eco


	}

}
