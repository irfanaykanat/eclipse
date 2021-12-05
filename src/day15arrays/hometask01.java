package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class hometask01 {

	public static void main(String[] args) {
		/*
		   Task: Type a program like; given an array whose length is 3, 
				 return an array with the elements "reversed"
			     For example; if the array is [1, 2, 3] output will be [2, 3, 1].
		
		*/
		 String str = "abcdef"; 
	     char[] A = str.toCharArray();
		 int offset=3;
	     int len = A.length;
	     offset %= len;
	     reverse(A, 0, len - offset - 1);
	     reverse(A, len - offset, len - 1);
	     reverse(A, 0, len - 1);
	     System.out.println("\n"+Arrays.toString(A));
	    }

	    private static void reverse(char[] str, int start, int end) {
	        while (start < end) {
	            char temp = str[start];
	            str[start] = str[end];
	            str[end] = temp;
	            start++;
	            end--;
	        }
		
	}

}
