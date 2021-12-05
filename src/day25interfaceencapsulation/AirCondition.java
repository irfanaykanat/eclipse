package day25interfaceencapsulation;

/* 1) Interface is not a class, interface is interface
 * 2) We need interface to create multiple parents for a class (since Java doe not support multiple parents)
 * 3) All methods must be "abstract" in interface because of that "interfaces" are used for "fully abstraction"
 *    Note: We can use "abstract" and concrete method together in "abstract classes" because of that using "abstract class is
 *    " partial abstraction 
 * 4) Do not use "abstract" keyword when you create interface. Because java knows interfaces are abstract 
 * 5) All methods are abstract in default in a interface, because of that using "abstract" keyword is optional
 * 6) All methods are public as default. Because of that access modifier is optional for methods in an interface
 * 7) if you make an "interface" parrents of a class do not use extends, use implements
 * 8) in different parents interfaces you can use methods with the same name, but be careful about return types
 * Be careful about return types, If the methods names are the sam, you cannot use different return types
 * 
 * 9) All variables in an interface are public, static (class variable), final as default
 * 		Note1: you can not create object by using "interfaces" because interfaces are fully abstract and they do not have "constructors"
 * 
 * 		Note2: "abstract classes"  have constructors the constructors are not use to create objects. 
 * 				We cannot create objects from abstract classes
 * 
 * 10) Java knows all variables an interface are " public, "static (class variable)", "final " as default because of that 
 * declaring " public, "static (class variable)", "final "  for variable is optional
 * 
 * 11) In different parents interfaces, you can create variable with same name, it will not be problem because every time
 * when you call variable you have to use interface name.
 * 
 * 12) it is not must to override the methods from interfaces, it is optional, if you want you can override  
 * 
 * 13) concrete class must be override all abstarct methods from all parents, otherwiese you will get CTE
 * if any abstract method is overridden by any parent class, it will not be must to override it
 * by concrete child class.
 * 
 * 14) Concrete Class to interface ===> implements
 * 	   Abstract Class==> Interface: implements
 * 	  ***** Interface===> interface: extends
 *    ***** Interface===> Concrete Class : This is not allowed in java class, class can not be parent of an interface
 * 	   Interface==> Abstract Class:   This is not allowed in java class, class can not be parent of an interface
 * 	   Abstract Class==> Concrete Class: extends 
 * 	   Concrete Class ===> Abstract Class: extends
 * 
 * 	  (Same class type use extends otherwise use implements)
 * 
 * 
 */





public interface AirCondition extends Vehicle {
	
public static final String MAKE= "Samsung";
	
public abstract void electronicAC();
	
public void climateAC();

void bacteriaKiller();

void run();

}
