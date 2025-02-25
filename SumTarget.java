import java.util.Arrays;

public class SumTarget {
	
	public static void main(String args[]) {
		
		int[] ar= {2,4,5};
		int target=8;
		int[] arr = sum(ar,target);
		System.out.println(Arrays.toString(arr));
		
	}
	public static int[] sum(int[] ar,int target) {
		int[] ars=new int[] {};
		for (int i=0; i<ar.length; i++){
			for(int j=i+1; j<ar.length; j++) {
				int sum=ar[i]+ar[j];
				if(sum==target) {
					return new int[] {i,j};
				}
			}
		}
	return ars;	
	}
}
