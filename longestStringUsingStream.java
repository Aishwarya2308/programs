import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class longestStringUsingStream {

	public static void main (String args[]) {
		List<String> list=Arrays.asList("intel","core","string");
		String longestString=list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(longestString);
		int lengthOflongestString=list.stream().map(String::length).max(Integer::compare).get();
		System.out.println(lengthOflongestString);
	}
}
