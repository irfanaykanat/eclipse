package day34carproject;

public class CarRunner {

	public static void main(String[] args) {

		System.out.println("========CAR1=======");
		
// DATA Typ (Class Name)						Object Typ (Class of Constroctor)
		Car                   car1    = new          Honda();
		System.out.println(car1.model);// null
		System.out.println(car1.carMake()); // Honda
		System.out.println(car1.carMOdel());// Accord
		System.out.println(car1.carYear());// 2012
		
		System.out.println("========CAR2=======");

		Car car2 = new Honda("Civic", 2020,20000 );
		
		
		System.out.println(car2.model);// null
		System.out.println(car2.carMake());//Civic
		System.out.println(car2.carMOdel());
		System.out.println(car2.carPrice());

		
		
		System.out.println("========CAR3=======");

		Car car3= new Toyota();
		System.out.println(car3.carMake());
		System.out.println(car3.carMOdel());
		System.out.println(car3.carYear());
		System.out.println(car3.carPrice());


		
	}

}
