package singlenumber;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
    	if (nums.length == 0) {
    		return 0;
    	}
    	
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
        	int count;
        	if (hm.containsKey(nums[i])) {
        		count = hm.get(nums[i]);
        		count++;
        		hm.put(nums[i], count);
        	} else {
        		hm.put(nums[i], 1);
        	}
        }
        
        Set<Integer> keys = hm.keySet();
        for (Iterator<Integer> k = keys.iterator(); k.hasNext(); ) {
        	int key = k.next();
        	int c = hm.get(key);
        	if (c == 1) {
        		return key;
        	}
        }
        return 0;
    }

}
