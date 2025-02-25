package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  Arrays.asList(12,9,13,4,6,2,4,12,15);
		Predicate reviewScoreGreaterThan90 =x->(x%2==0);
		List<String> list1 =  Arrays.asList("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		int sum=addList(list);
		List<Integer> doublelist = doubleList(list);
		List<Integer> evenlist = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		List<Integer> lengthoflist = list1.stream().map(x->x.length()).collect(Collectors.toList());
		//doublelist.forEach(System.out::println);
		System.out.println(lengthoflist);
		//System.out.println(list.stream().map(s->s*s).reduce(Integer::sum));
		//System.out.println(list.stream().filter(s->s%2==0).reduce(Integer::sum));
		//list.stream().distinct().forEach(System.out::println);
		//list.stream().distinct().sorted().forEach(System.out::println);
		//list1.stream().sorted().forEach(System.out::println);
		//list1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		//list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//list1.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
		//List<Integer> sorted=(List<Integer>) list.stream().sorted();
		//sorted.forEach(System.out::println);
		
	}

	private static List<Integer> doubleList(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().map(x->x*x).collect(Collectors.toList());
	}

	private static int sum(int a, int b) {
		return a+b;
	}
	private static int addList(List<Integer> list) {
		// TODO Auto-generated method stub
		//return list.stream().reduce(0,FP02Functional::sum);
		//return list.stream().reduce(0,(x,y)->x+y);
		return list.stream().reduce(0,Integer::sum);
	}

}
