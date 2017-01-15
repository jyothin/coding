package lengthoflis;

public class Solution {
	public int lengthOfLIS(int[] nums) {
		int l=0;
		@SuppressWarnings("unused")
		int h;
		
		if (nums.length > 0) {
			h = nums[0];
		} else {
			return 0;
		}
		
		for (int i=1; i<nums.length; i++) {
			if (nums[i-1] < nums[i]) {
				h = nums[i];
				l++;
			}
		}
		
		
		
		return l+1;
	}
}
