import java.util.Scanner;

public class Candies {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int N=10;
		if(value<=5 && value!=0) {
			N=N-value;
			System.out.println("NUMBER OF CANDIES SOLD : "+value);
			System.out.println("NUMBER OF CANDIES AVAILABLE "+N);
		}
		if(value==0) {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES AVAILABLE "+N);
		}
				
	}
}
