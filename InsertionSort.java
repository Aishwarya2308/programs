import java.util.*;
public class InsertionSort {
	
	public static void main(String args[]) {
		
		int arr[]= {2,5,6,8,9};
		int N=arr.length;
		for(int j=1; j<N; j++) {
			int key=arr[j];
			int i=j-1;
			while(i>-1 && arr[i]>key) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	for(int i:arr) {
		System.out.println(i);
	}
	}

}
