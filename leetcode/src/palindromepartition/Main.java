package palindromepartition;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		String input;
		List<List<String>> output;

		input = "aab";
		output = s.partition(input);
		Iterator<List<String>> iter = output.iterator();
		while (iter.hasNext()) {
			List<String> list = (List<String>) iter.next();
			Iterator<String> iter2 = list.iterator();
			while (iter2.hasNext()) {
				System.out.print(iter2.next()+":");
			}
			System.out.println();
		}
		System.out.println();
	}

}
