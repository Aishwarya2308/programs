
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,40,50,30};
		int x=20;
		System.out.println(findElement(a,0,a.length-1,x));
	}

	private static int findElement(int[] a, int l, int r, int x) {
		// TODO Auto-generated method stub
		while(l<=r) {
		int m=(l+r)/2;
		if(a[m]==x) {
			return a[m];
		}
		else if(a[m]>x) {
			r=m-1;
		}
		else {
			l=m+1;
		}
	}
	return -1;
	}
}
