package day12variabletypesmethodoverloadingconstructors;

/*
There are 3 main variable types in Java
1) Local Variables : Variables created in method body
       			 "age" and "sum" are local variables
					 Note 1 : Local Variables can be used just inside the method body method which you created it in
					 Note 2 : Do not use Local Variables without initializing (assigning a value) otherwise you get
					          Compile Time Error
					          
					          
2) Instance (Object) Variables : Variables created outside of all methods inside the class without 
								 using "static" keywords					          
					 			 "name" is an instance(object) variables
					 			 Note 1: If you want initialize the instance variable, if you want do not initialize
					 			         If you do not initialize Java puts "default values" for the instance variables
					 			         String==> null
					 			         byte- short- int- long- float- double ==>0
					 			         boolean==>false
					 			         char==> '' (which means Nothing)
					 			         
					 			  Note 2: Instance variables attached to every object.
					 			  
3) Class Variables: Variables created by using "static" keyword, "id" is a class variable (inside the class )	
				 			      Note 1: Class (Static) Variables are common for all objects created from the class (like Moon)
				 			      Note 2: Every updates on class variables will be visible by all objects (Like splitting Moon)
										data type of id is Null 
								  Note 3: If you need a variable which all objects need to share make class(static) variables
								          If you needs all object should see every update on a variable make the variable claa(static) variable		
										
										
										

Note for Instance and Static Variables: To access an "Instance Variable" from another class, you have to create an "object"
										but to access "Class Variable" from another class no need to create abject, 
										you can access to a "Class Variable"  by using just class name		
*/

public class VariableTypes01 {
	String name= "Ali Can";
	boolean isOld; // default value is false
	
	static String id;

	public static void main(String[] args) {
		int age =13;
		System.out.println(age);

	}

	
	
	public static int add(int a, int b) {
		int sum= a+b;
		return sum;

	}
	
	
	
	
}