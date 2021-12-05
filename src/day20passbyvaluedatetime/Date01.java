package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate.now();
		
		System.out.println(LocalDate.now()); // 2021-10-29
		System.out.println(LocalTime.now());// LocalDate.now();
		System.out.println(LocalDateTime.now()); // 2021-10-29T18:29:37.870237
		
		// How to manipulate date
		
		LocalDate currentdate = LocalDate.now();
		currentdate=currentdate.plusDays(7);
		System.out.println("the date after 7 days: " +currentdate);//  2021-11-05
		currentdate=currentdate.minusDays(3);
		
		System.out.println("t3 days before : " +currentdate);//  2021-11-02

		currentdate=currentdate.plusMonths(6);
		System.out.println("the date after 6 months: " +currentdate);//  22022-05-02

		currentdate=currentdate.plusYears(4).minusMonths(3).plusDays(17);
		System.out.println("After the method chain: " + currentdate );
		
		
		LocalDate dob = currentdate.of(2000, 11, 23);
		
		System.out.println(dob);// 2000-11-23
		
		System.out.println(currentdate.MAX); // +999999999-12-31

		System.out.println(currentdate.EPOCH); // 1970-01-01 (The date computers start to measure system time))


		// How to manipulate time
		
		LocalTime currentTime= LocalTime.now();
		int hour= currentTime.getHour();
		System.out.println(hour);//18
		
		//print the time 20:30
		
		LocalTime time = currentTime.of(20, 30);
		System.out.println(time);
		
		
		
		boolean isAfter=	currentTime.isAfter(time);
		System.out.println(isAfter); // false
		
		System.out.println(currentTime.MIDNIGHT);	 //00:00

		System.out.println(currentTime.MAX);// 23:59:59.999999999
	
		System.out.println(currentTime.NOON);	 // 12:00

		System.out.println(currentTime.MIN);// 00:00


		
		

	}

}
