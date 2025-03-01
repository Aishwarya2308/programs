package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String toString() {
		return name+ ":"+noOfStudents+":"+reviewScore;
	}
}
public class FP04CustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courses=
		Arrays.asList(
				new Course("Spring","Framework",98,20000),
				new Course("Spring Boot","Framework",95,18000),
				new Course("API","Microservices",97,22000),
				new Course("Microservices","Microservices",96,25000),
				new Course("FullStack","Fullstack",91,14000),
				new Course("AWS","Cloud",92,21000),
				new Course("Azure","Cloud",99,21000),
				new Course("Docker","Cloud",92,20000),
				new Course("Kubernetes","Cloud",91,20000));
		//allMatch,nonMatch,anyMatch
		Predicate<Course> reviewScoreGreaterThan95 = course->course.getReviewScore()>95;
		Predicate<Course> reviewScoreGreaterThan90 = course->course.getReviewScore()>90;
		Predicate<Course> reviewScoreLessThan90 = course->course.getReviewScore()<90;
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95));
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90));
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90));
		Comparator<Course> comparingNoOfStudentsIncreasing=Comparator.comparingInt(Course::getNoOfStudents);
		Comparator<Course> comparingNoOfStudentsDecreasing=Comparator.comparingInt(Course::getNoOfStudents).reversed();
		Comparator<Course> comparingNoOfStudentsAndNoOfReviews=Comparator.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore).reversed();
		System.out.println(courses.stream().sorted(comparingNoOfStudentsIncreasing).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingNoOfStudentsDecreasing).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
		//It limits to 5 elements
		System.out.println(courses.stream().sorted(comparingNoOfStudentsAndNoOfReviews).limit(5).collect(Collectors.toList()));
		//It skips 3 elements
		System.out.println(courses.stream().sorted(comparingNoOfStudentsAndNoOfReviews).skip(3).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingNoOfStudentsAndNoOfReviews).skip(3).limit(5).collect(Collectors.toList()));
		//It returns the last element of compared list
		System.out.println(courses.stream().max(comparingNoOfStudentsAndNoOfReviews));
		//It returns first element of compared list
		System.out.println(courses.stream().min(comparingNoOfStudentsAndNoOfReviews));
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).sum());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).average());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).count());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).max());
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
				Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName, Collectors.toList()))));
	}

}
