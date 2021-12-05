package day14statickeywordarrys;
	/*
	 Static Block : 1) We use static block to initialize static block variables
	 				2) if we use static block to initialize a static variable, it will be initialized before
	 				everything inside the class
	 				3) If there are multiple static blocks Java will execute them from first to last
	 
	 */

public class CircleCalculator {
	
	static String nameOfshape= "Circle";
	static double pi;

	
	static {
		pi=3.14;
		System.out.println("Static Block");
	}
	
	public CircleCalculator() {
		System.out.println("Constructor");
	} 
	

	public static void main(String[] args) {
		System.out.println("main method");
		method();
		CircleCalculator obj= new CircleCalculator();
		
	}
	
	
	public static void method() {
		System.out.println("Method");
	}

}
