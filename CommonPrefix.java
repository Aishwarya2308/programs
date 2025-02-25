@FunctionalInterface

interface Common {
    String common(String x);
}

public class CommonPrefix {
public static void main(String[] args) {
	String s[]= {"Greek","Gre","Great"};
	String comm=s[0];
	Common c = (i) -> {
		while(!i.startsWith(comm)) {
			comm=comm.substring(0, comm.length()-1);
		}
		return comm;
	};
	String common=longestCommonPrefix(s);
	System.out.println(common);
		
}
	public static String longestCommonPrefix(String s[]){
		if(s.length==0 || s==null) {
			return "";
		}
		String comm=s[0];
		
		for(int i=1; i<s.length; i++) {
			while(!s[i].startsWith(comm)) {
				comm=comm.substring(0, comm.length()-1);
			}
		}
		return comm;
	}		
}
