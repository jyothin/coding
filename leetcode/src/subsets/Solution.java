package subsets;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> lList = new ArrayList<>();
    	Arrays.sort(nums);
    	buildSubsets(lList, new ArrayList<Integer>(), nums, 0);
    	return lList;
    }
    
    public void buildSubsets(List<List<Integer>> lList, List<Integer> tempList, int[] nums, int start) {
    	lList.add(new ArrayList<>(tempList));
    	for (int i=start; i<nums.length; i++) {
    		tempList.add(nums[i]);
    		buildSubsets(lList, tempList, nums, i+1);
    		tempList.remove(tempList.size() - 1);
    	}
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    
}
