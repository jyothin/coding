package combinationsum;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input = new int[] {2, 3, 6, 7};
		int target = 7;
		List<List<Integer>> output;
		
		output = s.combinationSum(input, target);
		Iterator<List<Integer>> iter = output.iterator();
		while (iter.hasNext()) {
			List<Integer> list = (List<Integer>) iter.next();
			Iterator<Integer> iter2 = list.iterator();
			while (iter2.hasNext()) {
				System.out.print(iter2.next()+":");
			}
			System.out.println();
		}
		System.out.println();
		
		input = new int[] {10, 1, 2, 7, 6, 1, 5};
		target = 8;
		output = s.combinationSum2(input, target);
		iter = output.iterator();
		while (iter.hasNext()) {
			List<Integer> list = (List<Integer>) iter.next();
			Iterator<Integer> iter2 = list.iterator();
			while (iter2.hasNext()) {
				System.out.print(iter2.next()+":");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
