package day16arraysforeachloop;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// for-each-loop is the best to use 
		// for-each-loop can be used with containers which have multiple elements 
		// for-each-loop can be used with arrays
		
		// Task: Get the total number of characters of elements
		
		
		String s[]= {"Ali Can", "Veli Can", "Mary Star"};
		
		
		// do it by using for-loop
		
		int sum=0;
		for(int i=0; i<s.length; i++) {
			
			sum =sum +s[i].length();
		}
		System.out.println(sum);//24
		
		// do it by using for each-loop
		
		int sum2=0;
		
		for (String w:s) {
			
			sum2=sum2 +w.length();
		}
		
		System.out.println(sum2);//24
		
		
		
		
		// Print all elements in the given array if the elements has more than 6 characters 
		
		
		String t[]= {"Miami", "United States", "Jacksonville", "Samsun"};
		
		for(String w:t) {
			
			
			if (w.length()>6) {
				
				System.out.println(w);
			}
			
		}
		
		
		
		// print the common elements for 2 arrays 
		
		int arr1 []= {11, 21, 33};
		int arr2 []= {33, 34, 11};
		
		for(int w:arr1) {
			
			for(int x:arr2) {
				
				if(w==x) {
					System.out.println(w + " ");
				}
				
				
			}
			

					
					
					
		}

		


	}

}
