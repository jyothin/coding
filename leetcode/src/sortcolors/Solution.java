package sortcolors;

public class Solution {
    public void sortColors(int[] nums) {
    	int rCount = 0;
    	int wCount = 0;
    	int bCount = 0;
    	
    	for (int i=0; i<nums.length; i++) {
    		if (nums[i] == 0) {
    			rCount++;
    		} else if (nums[i] == 1) {
    			wCount++;
    		} else {
    			bCount++;
    		}
    	}
    	
    	int j = 0;
    	for (int i=0; i<rCount; i++) {
    		nums[j] = 0;
    		j++;
    	}
    	for (int i=0; i<wCount; i++) {
    		nums[j] = 1;
    		j++;
    	}
    	for (int i=0; i<bCount; i++) {
    		nums[j] = 2;
    		j++;
    	}
        
    }
    
    public void sortColors2(int[] nums) {
    	int rIndex = 0;
    	int bIndex = nums.length - 1;
    	
    	for (int i=0; i<nums.length; i++) {
    		if (nums[i] == 0 && i != rIndex) {
    			swap(nums, rIndex, i);
    			rIndex++;
    		} else if (nums[i] == 2 && i < bIndex) {
    			swap(nums, bIndex, i);
    			bIndex--;
    		}
    		while (nums[rIndex] == 0) { rIndex++; }
    		while (nums[bIndex] == 2) { bIndex--; }
    	}
    	
    }
    
    public void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
