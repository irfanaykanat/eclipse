package day33maps;

//1)There are 16 buckets as default when you create a HashMap
//2)Buckets use indexes from 0 to 15
//3)Every bucket has LinkedList
//4)When we use put() method, Java creates a HashCode(integer) of the key to access the entry faster
//5)But the HashCode will be greater than 15 what can Java do?
//	i)Can increase the index
//	ii)Can convert the HashCode value to the base 16
//	Java will do the second because the first uses memory too much.
//6)LinkedList in every bucket stores 4 data
//	i)HashCode (Inside the first part)
//	ii)Key (Inside the second part)
//	iii)Value (Inside the third part)
//	iv)Pointer(Next) (Inside the fourth part) (If there is no any node pointer will point null)
//7)What if same HashCode created from different keys
//	In a HashMap, if two or more Keys have the same hash code then
//	the situation is referred to as Hash Collision.
//	Hash Collisions are a common phenomena of hashing functions.
//	A good design of the hashing function may reduce the occurences of same hash code
//	for different Keys but it cannot be avoided alltogether.  	
//8)If the key is null it will use index 0



import java.util.HashMap;

public class HashMap03 {

	public static void main(String[] args) {
		
		// How HashMap work in Java 
		HashMap<String, Integer>hm1= new HashMap<>();
		
		hm1.put("abc", 5);
		
// 		HashCodes are large numbers because of that Java does not use HashCodes as indexes
// 		Java will divide hashCode value by 16 and will use the remainder as index
// 		if the remainder is seven for example the buckets as index 7
// 		inside the buckets we have linked lists 
// 		inside the linked list we have nodes, inside the nodes we have 4 parts 
//		   i) HashCode 
//		   ii) Key
//		   iii) Value
//	       iv) Pointer (Pointer points  null)
//		
//		
//		In a bucket you can have multiple "nodes" if you have single node pointer will point "null"
//		otherwiese it will point the next code
//		
		
		hm1.put(null, 12); // if the key is null the java will put the entry into the first bucket  
							// whos index is zero
//		
//		
			System.out.println("abc".hashCode()); // 96354
			
			
			
// if the buckets full then %75 Java increase doubles the capacity. Default is 16, when complete 13
// buckets it means Java will create more bucktes 
			
			
			
			
// Normally java wants to create unique hashcodes, but sometimes HashCodes can be same, 
//			this is called Hashmap Collusion
			
			System.out.println("FB".hashCode());//2236
			System.out.println("Ea".hashCode());//2236
			
			
			
			
			
			
			
			
			
			
	}

}
