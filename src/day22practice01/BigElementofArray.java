package day22practice01;

public class BigElementofArray {

	public static void main(String[] args) {
		 /*
	       Please find the biggest element in the given array
	      */
	      
		     int [] array = {1,24,2,342,123,543,54,3,2};
//	        Arrays.sort(array);
//	        System.out.println(array[array.length-1]);
	        int max = array[0];
	        for(int eachElement : array) {
	        	
	        	if(max <=  eachElement) {
	        		max = eachElement;
	        	}
	        }
	        System.out.println("Max value in the array is: "+max);
			
			
		}
		
		
	}

