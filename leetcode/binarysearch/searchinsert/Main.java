package searchinsert;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] input = new int[] {1, 3, 5, 6};
		int output;
		
		output = solution.searchInsert(input, 5);
		System.out.println(output);

		output = solution.searchInsert(input, 2);
		System.out.println(output);

		output = solution.searchInsert(input, 7);
		System.out.println(output);

		output = solution.searchInsert(input, 0);
		System.out.println(output);
		
		input = new int[] {1, 3};
		output = solution.searchInsert(input, 3);
		System.out.println(output);

	}

}
