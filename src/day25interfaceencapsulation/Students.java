package day25interfaceencapsulation;
/*
 * 1) "Encapsulation" means "data-hiding"
 * 2) to encapsulate, we use "private" keyword
 * 3) getter methods use data type of the variables as return type
 * 4)By the help of "encapsulation " you will able to do many tasks by using a single object 
 * 	i) Create an object  By using setters update the values which you need then work with newly updated object
 * 
 * 
 */


public class Students {
	
	private String name="Ali Can";
	private int grade=11;
	private boolean isSuccessfull= true;
	
	
	
	public Students() {
	}





	public Students(String name, int grade, boolean isSuccessfull) {
		this.name = name;
		this.grade = grade;
		this.isSuccessfull = isSuccessfull;
	}
	
	
	
	

	// getName() is called "getter" , getters() are for reading data 
	public String getName() {
		return name;
	}
	
	// setName() is called "setter", setters() are for updating data in usage

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	// If data type of a variable is boolean, getter method name starts with "is" instead of get
	public boolean isSuccessfull() {
		return isSuccessfull;
	}

	public void setSuccessfull(boolean isSuccessfull) {
		this.isSuccessfull = isSuccessfull;
	}



	// if you want to see objects on the console ceate toString()


	@Override
	public String toString() {
		return "Students : name=" + name + ", grade=" + grade + ", isSuccessfull=" + isSuccessfull  ;
	}
	
	
	

}
