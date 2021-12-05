package day21accessmodifiersstringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {

		
		StringBuilder sb1= new StringBuilder("Java");
		StringBuilder sb2= new StringBuilder("Java");

		System.out.println(sb1.charAt(2));// v
		// CompareTo() compares to StringsBuilder lexicographically
		// 0 means completely same 
		//"-" means first StrinBuilder is before the second one
		//"+"  means after  StrinBuilder is after the second one
		System.out.println(sb1.compareTo(sb2));		
		
		
		sb1.delete(1, 3);
		System.out.println(sb1);//Ja
		
		sb2.deleteCharAt(3);
		System.out.println(sb2);//Jav

		
		sb2.equals(sb1);
		System.out.println(sb2.equals(sb1));//false
		
		sb2.indexOf("v");
		System.out.println(sb2.indexOf("v"));//2
		
		
		sb2.indexOf("v",1);
		
		System.out.println(	sb2.indexOf("v",1));//1

		
		sb2.insert(1, "s");
		System.out.println(sb2); // it puts s in 1st index
		
		sb2.insert(1, "XYZ", 2,3);
		System.out.println(sb2);// JZsav
		
		StringBuilder sb3= new StringBuilder("Hollo world hello");
		
		sb3.lastIndexOf("o",6);

		System.out.println(sb3.lastIndexOf("o",6));//4
		
		
		
		sb3.replace(5, 7, "-");
		
		System.out.println(sb3); // Hollo-orld hello

		
		
		
		sb3.reverse();
		
		System.out.println(sb3);// olleh dlro-olloH

		sb3.setCharAt(2,'!');

		System.out.println(sb3);
		
		System.out.println(sb3.subSequence(6, 10)); //dlro==> CharSequence object
		
		System.out.println(sb3.substring(6, 10));//dlro ==> String Object
		
		//toString() method converts "StringBuilder" to "String"
		
		String s1= sb3.toString().replace("o", "*");
		System.out.println(s1); // *l!eh dlr*-*ll*H
		
		
		sb3 =new StringBuilder(s1);
		System.out.println(sb3);
		
		
		
		
		
		
		
		
		

	}

}
