package day25interfaceencapsulation;

public interface HybridEngine extends Vehicle {
	
	String MAKE= "Honda Eco";
	void havingHbridEngine();
	
	void run();
	
	// Until Java-8 it was not possible to put a concrete method an interface, after java-8 by using
	// default or static keyword
	// Note: Concrete methods even in the interfaces are not mandatory to override classes
	
	
	public default int power() {
		
		System.out.println("Hybrid engines are increasing their powers...");
		return 1000;
		
	}
	
	public static String model() {
		
		return "the best...";

	}

}
