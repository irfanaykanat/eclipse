package day23inheritanceoverriding;

public class Honda extends Car{
	
	/*
	 * 1) method Overriding: If child class uses a method from parent
	 * class by changing the method body (implementation), It
	 * is called method overriding 
	 * 
	 * 2) Overriding method: The method in Parent class
	 * 3) Overridden method: them method in child class
	 * 4) The access modifier of ovveridden method same as the access modifier
	 * 		of overriding method or wider than acces modifier of
	 * 		overriding method
	 *   		i) Overriding method: public---> Overridden method :public
	 *   		ii) Overriding method: protected---> Overridden method :protected, public
				iii) Overriding method: default---> Overridden method :default protected, public
				
		5) Private method can't be over ridden
		6) If return type overriding method is Void, then the return type of 
		overridden must be void
		
		7) If return type overriding method is primitive(integer), then the return type of 
		overridden must be same primitive data type (i.e int)

		8) If return type overriding method is wrapper class, then the return type of 
		overridden must be same wrapper class 
		
		9) If return type overriding method is non-primitive (Vehicle) , then the return type of 
		overridden must be same or child class (i.e Honda)
		
		10) Static methods can't be overridden
		
		11)"final" keyword:
		i) "final methods" can't be overridden. Final methods means 
		"the method body can't be override it"
		
		ii)  "final variable" can't be updated 
		iii) "final class" can't be parent class. final class can't have child class
		iv)  "finalize" is the process the garbage Collector applies and deltes object from memory
		garbage collector constantly  scans memory, and destroy the useless data.
		




	*/
	
	
	
	
     public void hybridEngine() {
		
		System.out.println("Honda has hybrid engine option...");
	}

	
	@Override
	public Integer age() {
		
		return 2;
		
		
	}


	@Override
	public void move() {

	System.out.println("Honda moves fast");
	
	}


	  @Override
	public Vehicle name() {
		return new Vehicle();
	}


	@Override
	  public int price() {

	  return 40000;
	}

	
}