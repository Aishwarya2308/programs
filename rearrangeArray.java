import java.util.Arrays;

public class rearrangeArray {
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,7-1,5,7,-2,-6,-5};
		rearrangeArray(arr);
		System.out.println("Rearranged array"+ Arrays.toString(arr));
	}
private static void rearrangeArray(int[] arr) {
	int[] temp=new int[arr.length];
	int index=0;
	for(int num: arr) {
		if(num<0) {
			temp[index++]=num;
		}}
		for(int num: arr) {
			if(num>=0) {
				temp[index++]=num;
			}
	}
		System.arraycopy(temp, 0, arr, 0, arr.length);
}
}
