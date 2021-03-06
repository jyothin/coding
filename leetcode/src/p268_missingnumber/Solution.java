package p268_missingnumber;

import java.util.Arrays;

public class Solution {
    public int missingNumberBinarySearch(int[] nums) {
    	Arrays.sort(nums);
    	int left = 0;
    	int right = nums.length;
    	int mid;
    	while (left < right) {
    		mid = (left +  right)/2;
    		if (nums[mid] > mid) {
    			right = mid;
    		} else {
    			left = mid+1;
    		}
    	}
    	return left;
    }
    
    public int missingNumberSum(int[] nums) {
    	int n = nums.length;
    	int sum = (n*(n+1))/2;
    	int s = 0;
    	for (int i=0; i<nums.length; i++) {
    		s += nums[i];
    	}
    	return sum-s;
    }
}
