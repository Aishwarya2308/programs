
public class rotateArray {
public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        rotateArray(nums,0,n-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,n-1);
    }
	private void rotateArray(int[] nums, int start, int end) {
	// TODO Auto-generated method stub
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
