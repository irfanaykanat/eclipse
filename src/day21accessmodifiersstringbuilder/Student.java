package day21accessmodifiersstringbuilder;

public class Student {
	
	
	// If you use "Private" as access modifier, it means you 
	//hid the date
	//If the access modifeier is "Private", it is impossible to see
	//from other classes
	//
	
	private String name= "Ali Can";
	
	
	// if you don't type any access modifier, it means access modifier is default
	// if the access modifier default, the data will be visible inside the entire package
	int age=13; // Default 
	
	
	//if you use  "protected" access modifier, you can access to it from inside the entire package
	//and from every child classes even they are different classes
	
	protected int grade=11;
	
	
	
	// If you use "public" access modifier, the class members (methods, variables, constructor)
	// the class members will be visible entire project
	public String  country="USA";
	
	
	
	
	

}
