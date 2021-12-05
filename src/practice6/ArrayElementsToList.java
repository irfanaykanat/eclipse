package practice6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElementsToList {

	public static void main(String[] args) {

		//Add elements of list to an Array and print them on the console	
		List<String> list1 = new ArrayList<String>();	
		
		
		list1.add("Ahmet");		    
		list1.add("Hasan");		    
		list1.add("Susan");		     
		list1.add("Brian");		   
		list1.add("Peter");
		
		Object[] array =list1.toArray();
		
		
		System.out.println(Arrays.toString(array)); // [Ahmet, Hasan, Susan, Brian, Peter]
		
		
		List<String> list2 = new ArrayList(Arrays.asList(array));
		
		System.out.println(list2);
	}

}
