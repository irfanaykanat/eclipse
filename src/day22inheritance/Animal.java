package day22inheritance;
/*
 * Parent- Chil Classes Relations (Inheritance)
 * 1) Public class memebers can be used in child class
 * 2) protected class members can be used in child class
 * 3) Default class members can be used in child class
 *    parent child classes must be in the sane package
 * 4) Private class members can't be used in child class
 * 5) Static class members should be accessed by child class name
 * 6) Java does not support multiple inheritance, A class can have only
 *    one parent class
 * 7) supper() is parent constructor call
 * 8) supper() must be in the first line in every constructor
 * 9) this() must be in first line as well
 *    we can not use this() ans super() in the same constructor
 *   
 */


public class Animal {
	
	public Animal() {
		System.out.println("Animal conscturctor");
	}
	
	
	
	int age;
	
	public void eat() {
		System.out.println("Animals eat....");
	}
	
	public void drink() {
		System.out.println("Animals drink....");
	}
	
	
	
}
