package day22practice01;
import java.util.Arrays;
public class SortArray {
	
	 /*
    Given the array below, sort array elements in ascending and descending order
     */
    public static void main(String[] args) {
    	
    	
    	int [] array = {1,24,2,342,123,543,54,3,2};// 9
    	
    	
    	for(int i= 0 ; i<array.length; i++) {
    		
    		for(int j =i+1; j<array.length; j++) {
    			
    			
    			
    			//1(24)				2(2)
    			// 0(1),01(1)        1(24)2(2)
    			if(array[i] <= array[j]) {
    				//24       24
    				int temp = array[i];
    				// 2        2
    				array[i] = array[j];
    				//24      24
    				array[j] = temp;
    				
    				
    				
    			}
    			
    			
    		}
    		
    		
    		
    		
    	}
    	
    	System.out.println(Arrays.toString(array));
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	//1, 2, 3 , 4 => ascending order
//    	//4, 3, 2, 1 descending order
//    	//	342			342
//    	int temp = array[3];
//    	//123			123
//    	array[3] = array[4];
//    	
//    	//342         342
//    	array[4] = temp;
    	
    	
	}
}