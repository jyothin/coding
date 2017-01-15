package p46p47_permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> lList = new ArrayList<List<Integer>>();
    	if (nums.length == 0) {
    		return lList;
    	}

    	List<Integer> list = new ArrayList<Integer>();
    	list.add(nums[0]);
    	
    	LinkedList<List<Integer>> queue = new LinkedList<List<Integer>>();
    	queue.add(list);

    	for (int i=1; i<nums.length; i++) {
    		queue = buildList(nums[i], queue);
    	}
    	
    	while (queue.peek() != null) {
    		lList.add(queue.pop());
    	}
    	
    	return lList;
    }
    
    public LinkedList<List<Integer>> buildList(int num, LinkedList<List<Integer>> lList) {
    	LinkedList<List<Integer>> newlList = new LinkedList<List<Integer>>();
    	while (lList.peek() != null) {
    		List<Integer> list = lList.pop();
    		for (int i=0; i<=list.size(); i++) {
    			List<Integer> newList = new ArrayList<Integer>();
    			list.add(i, num);
    			newList.addAll(list);
    			newlList.add(newList);
    			list.remove(i);
    		}
    	}
    	return newlList;
    }
    
    public List<List<Integer>> permute2(int[] nums) {
	   List<List<Integer>> list = new ArrayList<>();
	   // Arrays.sort(nums); // not necessary
	   backtrack(list, new ArrayList<>(), nums);
	   return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
	   if (tempList.size() == nums.length) {
	      list.add(new ArrayList<>(tempList));
	   } else {
	      for (int i = 0; i < nums.length; i++) { 
	         if (tempList.contains(nums[i])) continue; // element already exists, skip
	         tempList.add(nums[i]);
	         backtrack(list, tempList, nums);
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	}
	
	public List<List<Integer>> permuteUnique(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
	    return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
	    if(tempList.size() == nums.length){
	        list.add(new ArrayList<>(tempList));
	    } else{
	        for(int i = 0; i < nums.length; i++){
	            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
	            used[i] = true; 
	            tempList.add(nums[i]);
	            backtrack(list, tempList, nums, used);
	            used[i] = false; 
	            tempList.remove(tempList.size() - 1);
	        }
	    }
	}
	
}
