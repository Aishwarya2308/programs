
import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
	public static void main(String args[]) {
		List<String> str = new ArrayList <String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.forEach((n)-> System.out.println(n));
		
	}

}
