package twosum;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
    	boolean found = false;
    	int[] result = new int[2];
        for (int i=0; i<nums.length; i++) {
        	for (int j=i+1; j<nums.length; j++) {
        		if (nums[i] + nums[j] == target) {
        			result[0] = i;
        			result[1] = j;
        			found = true;
        			break;
        		}
        	}
        	if (found) { break; }
        }
        return result;
    }
    
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
