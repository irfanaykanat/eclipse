package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
		// Task: Find the longest word in a string 
		
		String s = "Ali can went to school to learn";
		
		String words[] =s.split(" ");
		System.out.println(Arrays.toString(words));// [Ali, can, went, to, school, to, learn]
		
		
		
		Arrays.sort(words, Comparator.comparingInt(String::length));
		
		System.out.println(Arrays.toString(words)); // [to, to, Ali, can, went, learn, school]
		
		// Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
		
		System.out.println(words[words.length-1]);

		// Get just the year from date in the "mm/dd/yyyy" format
		
		
		String date= "10/05/2021";
		
		String arr[]=date.split("/");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[2]);//2021
		System.out.println(arr[1]);//05
		System.out.println(arr[0]);//10

		
		
		// Get the initials of the student names
		
		String t = "Ali Can, Veli Han, Mary Star wento to school by bus";
		String u[]=t.split(", ");
		System.out.println(Arrays.toString(u));// [[Ali Can, Veli Han, Mary Star wento to school by bus]]

		String initials= "";
		for (int i=0; i<u.length; i++) {
			
			initials= u[i].substring(0,1)+u[i].substring(u[i].indexOf(" ")+1, u[i].indexOf(" ")+2);
			System.out.println(initials + " ");

			
		}
		

	}

}
