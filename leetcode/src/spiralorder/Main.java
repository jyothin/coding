package spiralorder;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] input;
		List<Integer> output;
		Iterator<Integer> iter;
		
		input = new int[][] {
				{1, 2, 3, 10, 13},
				{4, 5, 6, 11, 14},
				{7, 8, 9, 12, 15}
		};
		output = s.spiralOrder(input);
		iter = output.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().intValue()+", ");
		}
		System.out.println();
		
		input = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		output = s.spiralOrder(input);
		iter = output.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().intValue()+", ");
		}
		System.out.println();

		input = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{10,11,12}
		};
		output = s.spiralOrder(input);
		iter = output.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().intValue()+", ");
		}
		System.out.println();
		
		input = new int[][] {
			{7},
			{9},
			{6}
		};
		output = s.spiralOrder(input);
		iter = output.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().intValue()+", ");
		}
		System.out.println();
	}

}
