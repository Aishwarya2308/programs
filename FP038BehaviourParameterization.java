package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FP038BehaviourParameterization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  Arrays.asList(12,9,13,4,6,2,4,12,15);
		//filterAndPrint(list, x->x%2==0);
		//filterAndPrint(list, x->x%2!=0);
		//filterAndPrint(list, x->x%3==0);
		List<Integer> squareOfNumbers=mapAndCreateNewList(list, x->x*x);
		List<Integer> cubeOfNumbers=mapAndCreateNewList(list, x->x*x*x);
		List<Integer> doubleOfNumbers=mapAndCreateNewList(list, x->x+x);
		Supplier<Integer> randomIntegerSupplier=() -> {
			Random random=new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomIntegerSupplier.get());
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> list, Function<Integer, Integer> mappingFunction) {
		return list.stream()
				.map(mappingFunction)
				.collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> list, Predicate<? super Integer> predicate) {
		list.stream().filter(predicate).forEach(System.out::println);
	}

}
