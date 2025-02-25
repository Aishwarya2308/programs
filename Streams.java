import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String args[]) {
		List<String> myList=Arrays.asList("Apple", "Banana","Mango");
		Stream stream = myList.stream();
		List<String> filter1=myList.stream().filter(s->s.length()>5).collect(Collectors.toList());
		filter1.forEach(n->System.out.println(n));
	
		List<Integer> wordLengths = myList.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());
		wordLengths.forEach(n->System.out.println(n));
		List<String> upper=myList.stream().map(String :: toUpperCase).collect(Collectors.toList());
		upper.forEach(n->System.out.println(n));
		
	//startswithG
		List<String> myList2=Arrays.asList("abg", "dfg","rtg","ghj","gyh");
		myList2.stream().filter(s->s.startsWith("g")).forEach(System.out::println);
		List<Integer> myList3=Arrays.asList(11, 13,15,33,55);
		List<Integer> myList4=new ArrayList<Integer>();
		myList4=myList3.stream().filter(s->String.valueOf(s).startsWith("1")).collect(Collectors.toList());	
		myList3.stream().filter(s->String.valueOf(s).startsWith("1")).forEach(System.out.println(s*s));	
		for(int i:myList4) {
			System.out.println(i*i);
		}
	}
}
