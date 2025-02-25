import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String value=sc.nextLine();
		String words[]=value.split("//s");
		String reverse="";
		for(String w:words) {
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			reverse+=sb.toString();
		}
		System.out.println(reverse);
	}
}

