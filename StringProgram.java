import java.util.Scanner;
public class StringProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String s1= s.replaceAll("7","");
		String s2= s1.replaceAll("56","");
		StringBuilder s3 = new StringBuilder(s2);
		s3.reverse();
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
