import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int count=0;
    	for(int i=0; i<nums.length; i++) {
    	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    	}
    	int n=nums.length/2;
    	for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
    		if(entry.getValue()>n)
    		{
    			return entry.getKey();
    		}
    	}
    	return 0;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
