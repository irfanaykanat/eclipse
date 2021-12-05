package day25interfaceencapsulation;

public class Car implements AirCondition, HybridEngine, Vehicle{

	@Override
	public void electronicAC() {
		System.out.println("The Car AC is electronic...");
		
	}

	@Override
	public void climateAC() {
		System.out.println("The Car AC is electronic...");

		
	}
	
	
	@Override
	public void bacteriaKiller() {
		System.out.println("The car AC kills %99.9 bacteria...");

		
		
	}

	@Override
	public void havingHbridEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("The car AC runs perfectly");		
	}

}
