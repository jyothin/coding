package finddisappearednumbers;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input;
		List<Integer> output;
		
		input = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
		output = s.findDisappearedNumbers(input);
		Iterator<Integer> iter = output.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().intValue()+":");
		}

	}

}
