package p215_findkthlargest;

import java.util.Arrays;

public class Solution {
	public int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
	}
}
