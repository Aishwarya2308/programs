
public class StringWithConsecutiveCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AAABBCCCAA";
		char temp=str.charAt(0);
		char ch[]=str.toCharArray();
		int count=1;
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<ch.length-1; i++) {
			temp=ch[i];
			if(temp==ch[i+1]) {
				count++;
			}else {
				sb.append(temp+""+count);
				count=1;
			}
		}
		sb.append(temp+""+count);
		System.out.println(sb.toString());
	}

}
