package day12variabletypesmethodoverloadingconstructors;

public class VariableTypes01Runner {

	public static void main(String[] args) {
		
		
		
		VariableTypes01 obj1= new VariableTypes01();
		System.out.println(obj1.name); 
		
		
		
		
		
		obj1.name="Veli Han";
		System.out.println(obj1.name);// Veli Han
		
		System.out.println(obj1.id);//null;  Note: "id" has "yellow underline because you created an object to acces static variable"
		obj1.id= "New Id";  			// no need to do it, because class name is enough to access
		System.out.println(obj1.id);// New Id

		
		
		VariableTypes01 obj2= new VariableTypes01();
		System.out.println(obj2.name);



	}

}
