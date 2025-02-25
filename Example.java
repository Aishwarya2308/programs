
public class Example {
	
	public static void main(String args[]) {
		String str="{[()]}";
		String str1="{)[}(]";
		Balanced(str1);
		
	}
	public static void Balanced(String str) {
		int count=0;
		char arr[] = str.toCharArray();
		if(arr[0]=='}' || arr[0] == ']' || arr[0] == ')' ) {
				System.out.println("Unbalanced Parenthesis");
			}
		else{
			for(int i=0; i<arr.length; i++) {
				if(arr[i]=='{') {
					count++;
			}	if(arr[i]=='}') {
				count--;
			}	if(arr[i]=='(') {
					count++;
			}	if(arr[i]==')') {
				count--;
			}	if(arr[i]=='[') {
				count++;
				
			} 	if(arr[i]==']') {
				count--;
			}	
		}
			if(count==0) {
				System.out.println("Balanced Paranthesis");
			}
			else {
				System.out.println("UnBalanced Paranthesis");
			}
		}	
	}
}
