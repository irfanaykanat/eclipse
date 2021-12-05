package day30collections;

import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList: i) slow in insertion and deletion, due to some indexes are updated
 * 			  ii) fast in search since we can use index of elements to reach them
 * 
 * 
 * 
 * LinkedList: i) fast in insertion/removing element since it does not use index
 * 			   ii) slow in search since we should check element from head ro tail
 */





public class LinkedList01 {

	public static void main(String[] args) {

		LinkedList<String>ll1= new LinkedList<>();
		
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Can");
		ll1.add("Mete");

		
		// How to print a linked list
		
		System.out.println(ll1);
		
		// How to get the first element from a linked list
		
		String fristElement1= ll1.getFirst(); // Coming from Deque interface, returns first element 
		System.out.println(fristElement1); //Ali
		System.out.println(ll1);// [Ali, Veli, Can, Mete]

		
		
		String firstElement2= ll1.element(); // Coming from Queue  interface, returns first element 
		System.out.println(fristElement1);//Ali
		System.out.println(ll1);// [Ali, Veli, Can, Mete]
		
		String firtselement3= ll1.peek(); // Coming from Queue  interface, returns first element 
		System.out.println(fristElement1);//Ali
		System.out.println(ll1);// [Ali, Veli, Can, Mete], 
		
		String firtselement4= ll1.poll();// Queue, returns first element 
		System.out.println(firtselement4);// Ali
		System.out.println(ll1); // [Veli, Can, Mete]
		
		
		// How to get first element an empty link list 

		LinkedList<String>ll2= new LinkedList<>();  // empty linked list 
//		String firstelementFromEmptyLinkedList= ll2.getFirst(); // It throws oSuchElementException
//		System.out.println(firstelementFromEmptyLinkedList);

		
//		String firstelementFromEmptyLinkedList2= ll2.getFirst(); // It throws oSuchElementException
//		System.out.println(firstelementFromEmptyLinkedList2);

		
		String firstelementFromEmptyLinkedList3= ll2.peek(); // null
		System.out.println(firstelementFromEmptyLinkedList3);
		
		
		String firstelementFromEmptyLinkedList4= ll2.poll(); // null
		System.out.println(firstelementFromEmptyLinkedList4);
		
		
		// How to remove an element from a link list 
		LinkedList <Integer> ll3= new LinkedList<>();
		
		ll3.add(0,5);
		ll3.add(1,9);
		ll3.add(2,3);
		ll3.add(3,7);
		System.out.println(ll3);// [5, 9, 3, 7]
		

        int removed= ll3.remove();
        System.out.println(removed); //5
        System.out.println(ll3);// [9, 3, 7]


        int removed2= ll3.remove(2);
        System.out.println(removed2);//7
        System.out.println(ll3);// [9, 3]

        
        ll3.add(9);
        ll3.add(5);
        ll3.add(3);
        	
        System.out.println(ll3); // [9, 3, 9, 5, 3]
        
        ll3.removeFirstOccurrence(3);
        System.out.println(ll3);// [9, 9, 5, 3]

        
        ll3.removeLastOccurrence(9);
        System.out.println(ll3); //[9, 5, 3]



		// How to remove multiple elements from a linked list
        ll3.add(4);
        ll3.add(5);
        ll3.add(9);
        ll3.add(7);
        System.out.println(ll3);

		
		LinkedList <Integer> ll4= new LinkedList<>();
		
		ll4.add(5);
		ll4.add(9);
		ll4.add(7);
         System.out.println(ll4);
         
         
         ll3.removeAll(ll4);
         System.out.println(ll3); // [3, 4]
         
         
         ll4.removeAll(ll4);
         System.out.println(ll4);// []
         
         
         // How to insert multiple elements into a linked list
         
         System.out.println(); // [3, 4]
         ll3.addAll(ll3);
         System.out.println(ll3); // [3, 4, 3, 4]
         

         
         // How to update a specific node
         ll3.set(1,10);
         System.out.println(ll3);// [3, 10, 3, 4]
         
         
         // How to get a sub-list from a linked list 
         List <Integer>sublist01=  ll3.subList(1, 3);
         System.out.println(sublist01); // [10, 3]


         
	}

}
