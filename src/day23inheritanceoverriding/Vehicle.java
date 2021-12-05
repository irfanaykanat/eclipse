package day23inheritanceoverriding;

/*
 * 1) Multiple inheritance: Child class can not have multiple parents, Java does not support
 * 2) Hierarchical inheritance: A parent can have multiple child classes 
 * 3) Multi-level inheritance: Child---> Parent--->Grandparent
 * 4) Is-A Relation: it is child parent relation 
 * 		dog is a animal (Doc Class- Animal class)
 * 5) HAS-A relation: It is parent-child relation
 * 		Animal Has-A Mammal (Animal Class> Mammal Class)
 * 
 * 
 * 
 */

public class Vehicle {

	
	public void move() {
		
		System.out.println("Vehichele moves..");
	}
	
	public int price() {
		
		return 10000;
		}

	
		public Integer age() {
		
		return 0;
		}
	
		public Vehicle name() {
			
			return new Vehicle();
		}
	
	
}
