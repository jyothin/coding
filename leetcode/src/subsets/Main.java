package subsets;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input = new int[]{1, 2, 3};
		List<List<Integer>> output;
		
		output = s.subsets(input);
		Iterator<List<Integer>> iter = output.iterator();
		while (iter.hasNext()) {
			List<Integer> list = (List<Integer>) iter.next();
			Iterator<Integer> iter2 = list.iterator();
			while (iter2.hasNext()) {
				System.out.print(iter2.next()+":");
			}
			System.out.println();
		}
		
		input = new int[]{1, 2, 2};
		output = s.subsetsWithDup(input);
		iter = output.iterator();
		while (iter.hasNext()) {
			List<Integer> list = (List<Integer>) iter.next();
			Iterator<Integer> iter2 = list.iterator();
			while (iter2.hasNext()) {
				System.out.print(iter2.next()+":");
			}
			System.out.println();
		}
		
	}

}
