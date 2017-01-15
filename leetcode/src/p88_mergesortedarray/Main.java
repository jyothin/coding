package p88_mergesortedarray;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums2 = new int[] {-1, 0, 1, 2, 3, 4};
		int n = nums2.length;
		int[] nums1 = new int[] { 2, 3, 4, 5, 0, 0, 0, 0, 0, 0};
		int m = 4;
		s.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
		
		nums1 = new int[] {0};
		m = 0;
		nums2 = new int[] {1};
		n = 1;
		s.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
		
	}
}