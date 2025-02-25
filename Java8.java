import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;  
public class Java8 {
	  
	    public static void main(String[] args) {  
	       List<String> games = new ArrayList<String>();
	       games.add("A");
	       games.add("B");
	       games.add("C");
	       games.add("D");
	       games.forEach(System.out::println);
	       //int[] arr= {4,7,8,3};
	       ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(10);
			arr.add(20);
			arr.add(7);
			arr.add(70);
			arr.add(1);
			//Predicate<Integer> condition=new Predicate<Integer>() {
			List<Integer> list=Arrays.asList(2,6,3,7);
	
				
			
			List<Integer> arr1 = list.stream().filter(p->p%2!=0).map(p->p*5).collect(Collectors.toList());
			arr1.forEach(n->System.out.println(n));
			System.out.println(isPowerOfTen(99));
	} 
	    public static boolean isPowerOfTen(int a) {
	    	if(a<=0) {
	    		return false;
	    	}
	    	while(a>1) {
	    		if(a%10!=0) {
	    			return false;
	    		}
	    		a/=10;
	    	}
	    	return true;
	    }
}
