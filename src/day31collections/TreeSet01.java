package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * 1) "TreeSet" is to store unique elements in natural order
 *   	Natural order is alphabetical oder for "String"
 *   				  is ascending order for "integers"
 *   
 *  2) "TreeSet"  does not accept "null" as element
 * 
 * 
 */


public class TreeSet01 {

	public static void main(String[] args) {
//Parent Class, Interface Class, Class name   <Object Type>    object name  = new 	class constroctor of method it must be same name as class
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		ts1.add(12);
		ts1.add(3);
		ts1.add(7);
		ts1.add(5);
		ts1.add(2);
		System.out.println(ts1); // [2, 3, 5, 7, 12]


//		ts1.add(null); // it throws NullPointerException
		
		
//	way1	1) How to unique elements in natural order? By adding them into a TreeSet
//	way2 	2) TreeSet is too slow, how can you make the code run faster
//		3) In terms of speed: TreeSet (slow)<LinkedHashSet< HashSet (fastest)
		
// 		 firstly, create a HashSet, and put elements into the HashSet, 
//		 then create a TreeSet, and convert HashSet to TreeSet
		
		
		// Way 1: 
		
		long t1= System.nanoTime();
		
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("A");
		ts2.add("X");
		ts2.add("P");
		ts2.add("K");
		ts2.add("D");
		
		System.out.println(ts2); // [A, D, K, P, X]

		long t2= System.nanoTime();

		// Way 2: 
		
		HashSet<String> hs1 = new HashSet<>();

		hs1.add("A");
		hs1.add("X");
		hs1.add("P");
		hs1.add("K");
		hs1.add("D");

		System.out.println(hs1); // [P, A, D, X, K]

		TreeSet<String> ts3 = new TreeSet<>();
		ts3.addAll(hs1);
		System.out.println(ts3); // [A, D, K, P, X]

		TreeSet<String> ts4 = new TreeSet<>(hs1); // we are using constroctor 

		System.out.println(ts4); // [A, D, K, P, X]
		
		long t3= System.nanoTime();
		
		
		System.out.println(t2-t1); // 66583
		System.out.println(t3-t2);// 190000


	}

}
