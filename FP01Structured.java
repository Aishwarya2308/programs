package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  Arrays.asList(12,9,13,4,6,2,4,12,15);
		//printAllNumbersInListFunctional(list);
		//printAllEvenInListFunctional(list);
		//printAllOddInListFunctional(list);
		List<String> list1 =  Arrays.asList("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		//list1.stream().forEach(System.out::println);
		//list1.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
		//list1.stream().filter(s->s.length()>=4).forEach(System.out::println);
		//printSquaresofEvenInListFunctional(list);
		//printCubeofOddInListFunctional(list);
		list1.stream().map(s->s+" "+s.length()).forEach(System.out::println);
	}

	private static void printCubeofOddInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(s->s%2!=0).map(s->s*s*s).forEach(System.out::println);
	}

	private static void printAllOddInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(s->s%2!=0).forEach(System.out::println);
	}

	private static void printAllEvenInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		//list.stream().filter(FP01Structured:: isEven).forEach(System.out::println);
		list.stream().filter(s->s%2==0).forEach(System.out::println);
	}
	private static void printSquaresofEvenInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		//list.stream().filter(FP01Structured:: isEven).forEach(System.out::println);
		list.stream().filter(s->s%2==0).map(s->s*s).forEach(System.out::println);
	}

	private static void printAllNumbersInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().forEach(System.out::println);
	}
	private static void print(int number) {
		// TODO Auto-generated method stub
		System.out.println(number);
	}
	private static boolean isEven(int number) {
		// TODO Auto-generated method stub
		return number%2==0;
	}
}
