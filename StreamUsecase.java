import java.util.*;
import java.util.stream.Collectors;
public class StreamUsecase {
public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(14);
		arr.add(70);
		arr.add(90);
		List<Integer> arr1 = arr.stream().filter(p -> p>50).collect(Collectors.toList());
		System.out.println(arr1);
		
		
	}

}
