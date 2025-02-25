import java.util.HashMap;

public class StringWithCount {
	public static void main(String[] args) {
		String s="abaabcbb";
		stringWithCount(s);
		
		
	}

	private static void stringWithCount(String s) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Character c: map.keySet()) {
			System.out.println(c+""+map.get(c));
		}
	}
}
