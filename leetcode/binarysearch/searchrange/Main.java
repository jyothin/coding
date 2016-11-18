package searchrange;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] input = new int[] {5, 7, 7, 8, 8, 10};
		int[] output;
		
		output = solution.searchRange(input, 5);
		System.out.println(output[0]+","+output[1]);

		output = solution.searchRange(input, 2);
		System.out.println(output[0]+","+output[1]);

		output = solution.searchRange(input, 7);
		System.out.println(output[0]+","+output[1]);

		output = solution.searchRange(input, 8);
		System.out.println(output[0]+","+output[1]);
		
		/*input = new int[] {1, 3};
		output = solution.searchInsert(input, 3);
		System.out.println(output);*/

	}

}
