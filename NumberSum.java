import java.util.*;
public class NumberSum {

public static void main(String args[]) {
		
		int number=567;
		int sum=0;
		while(number>0)
		{
			int s=number%10;
			sum+=s;
			number=number/10;
	}
		
		System.out.println(sum);
	}
	
}
