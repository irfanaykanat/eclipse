package day002variablesscanner;

public class Day02TypeCasting {

	public static void main(String[] args) {
	
		byte b1= 12;
		short s1= b1;
		
		int i1 =123;
		float f1 = i1;
		
		
		double d1 = 2.34;
		float f2 = (float)d1; 
		
		long l1= 234;
		
		byte b2 = (byte)l1;
		
		System.out.println(l1);
		System.out.println(b2);
		
		int i2 =123;
		
		
		
		Integer i2Wrapper =i2;
		
		
		Integer i3Wrapper =234; 
		int i3 = i3Wrapper; 
		
		
		
		

	}

}
