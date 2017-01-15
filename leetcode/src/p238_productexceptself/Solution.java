package p238_productexceptself;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int index = 0;
		output[index] = 1;
        while (index < nums.length) {
        	if (index > 0) {
        		output[index] = output[index-1] * nums[index-1];
        	}
        	for (int i=0; i<index; i++) {
        		output[i] *= nums[index];
        	}
        	index++;
        }
        return output;
    }
    
    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
