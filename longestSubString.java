import java.util.HashSet;

public class longestSubString {
public static void main(String[] args) {
	String s="abaabcbb";
	String s1=longestSubstring(s);
	System.out.println(s1);	
	
}

private static String longestSubstring(String s) {
	// TODO Auto-generated method stub
	int n=s.length();
	int start=0;
	int maxLength=0;
	String longest="";
	HashSet<Character> set= new HashSet<>();
	for(int end=0; end<n; end++) {
		while(set.contains(s.charAt(end))) {
			set.remove(s.charAt(start));
			start++;
		}
		set.add(s.charAt(end));
		if(end-start+1>maxLength) {
			maxLength=end-start+1;
			longest=s.substring(start, end+1);
		}
	}
	return longest;
}
}
