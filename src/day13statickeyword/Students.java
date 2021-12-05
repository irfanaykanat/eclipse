package day13statickeyword;


// Task: Type code to count the number objects created from Students class

public class Students {
	
	
	public String name;
	public int age;
	public static int numOfStudents;
	public String steudenId;
	
	
	public Students() {
		this.name="Ali Can";  //anladigim kadar "this" object variables giriyor ve bu obje icin deger atiyor
		this.age= 10;
		numOfStudents++;
		this.steudenId= name.substring(0,2)+ age+numOfStudents;

		
	}
	
	public Students(String name, int age) {
		this.name= name;
		this.age= age;
		numOfStudents++;
		this.steudenId= name.substring(0,2)+ age+numOfStudents;

		}
	
	public Students(String name) {
		this.name=name;
		numOfStudents++;
		this.steudenId= name.substring(0,2)+ age+numOfStudents;


		}

	
	

	public static void main(String[] args) {
		System.out.println("Before std1 created: " + numOfStudents);
		Students std1= new Students();
		System.out.println(std1.name);

		System.out.println(std1.steudenId);
		
		System.out.println("After std1 created: " + numOfStudents);

		Students std2= new Students();
		System.out.println("After std1, std2 created: " + numOfStudents);
		System.out.println(std2.steudenId);

		
		Students std3= new Students("Veli Han", 12);
		System.out.println("After std1, std2,std3 created: " + numOfStudents);
		System.out.println(std3.steudenId);

		
		Students std4= new Students("Kemal Efe");
		System.out.println("After std1, std2,std3, std4 created: " + numOfStudents);
		System.out.println(std4.steudenId);





		
		
		
	
	}

}
























