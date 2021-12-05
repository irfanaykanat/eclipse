package practice6;
import java.util.*;
public class SortElementsOfListInDecs {
	
	
	public static void main(String args[]) {
		//Sort all elements of list in reverse order / descending order
		
		
	      ArrayList<Integer> myList = new ArrayList<Integer>();
	      myList.add(30);
	      myList.add(99);
	      myList.add(12);
	      myList.add(23);
	      myList.add(8);
	      myList.add(94);
	      myList.add(98);
	      myList.add(66);
	      
	   //   myList.sort(Comparator.reverseOrder());  // first way
	      
	   // Collections.sort(myList,Collections.reverseOrder()));  // second way

	      Collections.sort(myList);			// third way
	      Collections.reverse(myList);
	      
	      System.out.println(myList);
	     
	}
	
}