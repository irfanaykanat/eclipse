package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FpDt02 {
	
	/*
	 * 1) "Variable or Variables or zero variable " -> "Logic"
	 * The structure is called "Lambda Expression"
	 * 2
	 * 2) In Functional Programming, we can use "Lambda Expression", it is allowed but no recommended
	 * Instead of "Lambda Expression", we prefer to use "Method Reference"
	 * 
	 * 3) Methods reference is "Class name:: Method Name"
	 *     For example; "String ::length"  (Do not type parenthesis), type kust method name
	 *     
	 *     "Arrays:: toString"
	 *     
	 *     You can use your own class as well, foe example you created Animal Class and you have est() method
	 *     in Animal Class 
	 *     
	 *     "Animal::eat"
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(8);
		l.add(9);
		l.add(131);
		l.add(10);
		l.add(9);
		l.add(10);
		l.add(2);
		l.add(8);
		l.add(15);

		
		
		printElementsFunctional(l);
		System.out.println();
		printEvenElementsFunctional(l);
		System.out.println();

		printSquareOFOddElements(l);
		System.out.println();
		printCubeOfDistinctOddElements(l);
		System.out.println();

		sumOfSquareOfDistinctEvenElements01(l);
		sumOfSquareOfDistinctEvenElements02(l);
		
		productOfCubesOfDistinctEvenElements01(l);
		getMaxElement(l);
		getMinGreaterThenSeven(l);
		getHalfOfDistinctElemenstInReverseOrder(l);// [65.5, 7.5, 5.0, 4.5, 4.0]


		
	}

	//1)Create a method to print the list elements on the console in the same line with a space
		//  between two consecutive elements.(Functional with method reference)

		public static void printElementsFunctional(List<Integer> list) {
			list.stream().forEach(UtilsDt::printInTheSameLineWithSpace);
			
			
		}
	
	
	
	
	
		//2)Create a method to print the even list elements on the console in the same line with a space
	//  between two consecutive elements.(Functional with method reference)

	      public static void printEvenElementsFunctional(List<Integer> list) {
	    	    
	   list.stream().filter(UtilsDt::checkToBeEven).forEach(UtilsDt::printInTheSameLineWithSpace);
	    	  
	      }
	
	      //3)Create a method to print the square of odd list elements on the console in the same line with a
	      //  space between two consecutive elements.
	          
	          
	    public static void printSquareOFOddElements(List<Integer> list) {
	        	  
	 	   list.stream().filter(UtilsDt::checkToBeOdd).map(UtilsDt::getSquare).forEach(UtilsDt::printInTheSameLineWithSpace);
	        	  
	          }
	
	
	    

	      //4)Create a method to print the cube of distinct odd list elements on the console in the same line 
	      //  with a space between two consecutive elements. 
	      
	      public static void printCubeOfDistinctOddElements(List<Integer> list) {
	  
	   list.stream().distinct().filter(UtilsDt::checkToBeOdd).map(UtilsDt::getCube).
	   forEach(UtilsDt::printInTheSameLineWithSpace);


	    	  
	      }
	    
	      //5)Create a method to calculate the sum of the squares of distinct even elements

	      //1.way
	      public static void sumOfSquareOfDistinctEvenElements01(List<Integer> list) {
	    	  
	    	  
	    Integer sum=	 list.stream().distinct().filter(UtilsDt::checkToBeEven).map(UtilsDt::getSquare).
	    	 reduce(0, Math::addExact);
	    	  
	    System.out.println(sum);
	    	  
	      }    
	      
	      //2. way
	      public static void sumOfSquareOfDistinctEvenElements02(List<Integer> list) {
	    	  
	    	  
	  	    Integer sum=	 list.stream().distinct().filter(UtilsDt::checkToBeEven).
	  	    				 map(UtilsDt::getSquare).
	  	    				 reduce(0, Integer::sum);
	  	    	  
	  	    System.out.println(sum);
	  	    	  
	  	      }    
	
	      
	    //6)Create a method to calculate the product of the cubes of distinct even elements
	      public static void productOfCubesOfDistinctEvenElements01(List<Integer> list) {
	    	  
	    	  
	    	Integer product=  list.stream().distinct().filter(UtilsDt::checkToBeEven).map(UtilsDt::getCube).
	    	  reduce(1, Math::multiplyExact);
	    	
	    	System.out.println(product);
	      }
	      
	     
	      
	   
	      
	      //7)Create a method to find the maximum value from the list elements

	      
	      public static void getMaxElement(List<Integer> list) {

	      	Integer max=  list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
	      	  System.out.println(max); 


	        }
	          
	      //Homework by using Method reference
	    	//8)Create a method to find the minimum value from the list elements(In 2 ways)
	      
	      
	      
	      //9)Create a method to find the minimum value which is greater than 7 and even from the list  
	      
	      
	      // 1.way
	      public static void getMinGreaterThenSeven(List<Integer> list) {

	      
	    Integer minValue= list.stream().distinct().filter(UtilsDt::checkToBeEven).filter(t->t>7).
	    		          reduce(Integer.MAX_VALUE,Math::min);
	    	  
	    	  System.out.println(minValue);
	    	  
	      }     
	      
	      
	      
	      //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
	      
	      
	      public static void getHalfOfDistinctElemenstInReverseOrder(List<Integer> list) {
	    	  
	    List<Double> result= list.
	    		                stream().
	    		                distinct().
	    		                filter(t->t>5).
	    		                map(UtilsDt::getHalf).
	    		                sorted(Comparator.reverseOrder()).
	    	                   	collect(Collectors.toList());
	    
	    
	    
	    
	    	  System.out.println(result);
	    	  
	      }
	      
	      
	      
	
}
