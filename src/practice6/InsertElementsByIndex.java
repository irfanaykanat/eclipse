package practice6;

import java.util.ArrayList;
import java.util.List;

public class InsertElementsByIndex {

	public static void main(String[] args) {

		//Add these fruits to their given indexes in a list
		 //The ArrayList elements are: [Apple, Melon, Mango, Grape, Banana]
		
		
	      List List = new ArrayList<>();

	      
	      List.add(0, "Apple"); //[Apple,Melon, Mango, Grape, Banana]
	      List.add(1, "Mango");
	      List.add(2, "Banana");
	      List.add(1, "Melon");
	      List.add(3, "Grape");

	      
	      System.out.println(List);
	}

}
