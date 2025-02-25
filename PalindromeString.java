import java.util.stream.IntStream;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="abc";
		System.out.println(isPalindrome(originalString));
	}

	private static boolean isPalindrome(String originalString) {
		// TODO Auto-generated method stub
		return IntStream.range(0, originalString.length()/2).noneMatch(i->originalString.charAt(i) != originalString.charAt(originalString.length()-i-1));
	}

}
