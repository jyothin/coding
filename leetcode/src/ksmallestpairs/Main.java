package ksmallestpairs;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Given nums1 = [1,7,11], nums2 = [2,4,6],  k = 3
		// Return: [1,2],[1,4],[1,6]
		int[] nums1 = new int[] {1, 7, 11};
		int[] nums2 = new int[] {2, 4, 6};
		Solution solution = new Solution();
		List<int[]> output = solution.kSmallestPairs(nums1, nums2, 3);
		for (int i=0; i<output.size(); i++) {
			System.out.print("["+output.get(i)[0]+","+output.get(i)[1]+"] ");
		}
		
	}

}
