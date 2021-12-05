package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fp06 {

	public static void main(String[] args) {
		
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
        
        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        
        
       System.out.println( checjAvgScoresToBeGreaterThenGivenNumber(coursesList, 91)); // true
       System.out.println(checkIfAnyCourseNameContainsGivenWords(coursesList, "Turkish")); // true
       
       System.out.println(getCourseNameWhoseAvgIsTheHighest(coursesList)); // Turkish Night

       System.out.println(sortCoursesWithAvgScoreInAscendingSkipFirtsGiven(coursesList, 3)); // [Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154]

       
       System.out.println(getThirdAfterSortingInAsc01(coursesList, 3)); // [Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128]
       System.out.println(getThirdAfterSortingInAsc02(coursesList, 3)); // Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128


	}

	//1)Create a method to check if all average scores are greater than given Number

	public static boolean checjAvgScoresToBeGreaterThenGivenNumber(List<Course> list, double avgScore) {
		
	return list.stream().allMatch(t->t.getAverageScore()>avgScore);
		
	}
	
	
	//2)Create a method to check if at least one of the course names contains given word

	
	public static boolean checkIfAnyCourseNameContainsGivenWords(List<Course> list, String word) {
		
		return list.stream().anyMatch(t->t.getCourseName().contains(word));
			
		}
	
	
	//3)Create a method to print the course whose average score is the highest

	
	
	public static String getCourseNameWhoseAvgIsTheHighest (List<Course> list) {
		Course obj=  list.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
		return obj.getCourseName();
		}
	
	
	//4)Sort the list elements according to the average score in ascending order and skip first 2 elements

	public static List<Course> sortCoursesWithAvgScoreInAscendingSkipFirtsGiven (List<Course> list, long num) {
		
	return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(num).collect(Collectors.toList());

	
	}
	
	
	
	//5)Sort the list elements according to the average score in ascending order and print just 3rd one

	public static List<Course> getThirdAfterSortingInAsc01(List<Course> list, int num) {
		
		return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(num-1).limit(1).collect(Collectors.toList());
	}

	
	
	
	public static Course getThirdAfterSortingInAsc02(List<Course> list, int num) {
		
		return (Course) list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(num-1).findFirst().get();
	}

	
	
	
	
	
	
	
}
