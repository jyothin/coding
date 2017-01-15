package p55_canjump;

import java.util.Arrays;

public class Solution {
    public boolean canJump(int[] nums) {
    	return reach(nums, 0);
    }
    
    public boolean reach(int[] nums, int cur) {
    	if (cur == nums.length-1) { return true; }
    	else if (0 <= cur && cur < nums.length && nums[cur] != 0) {
    		int jump = nums[cur];
    		nums[cur] = 0;
    		System.out.println(Arrays.toString(nums)+":"+jump);
    		return reach(nums, cur+jump) || reach(nums, cur-jump);
    	} else {
    		return false;
    	}
    }
    
    public boolean canJump2(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
