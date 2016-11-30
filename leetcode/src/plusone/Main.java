package plusone;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] output;
		int[] input;
				
		input = new int[]{0};
		output = solution.plusOne(input);
		displayIntArray(output);

		input = new int[]{5};
		output = solution.plusOne(input);
		displayIntArray(output);

		input = new int[]{9};
		output = solution.plusOne(input);
		displayIntArray(output);
		
		input = new int[]{1, 0};
		output = solution.plusOne(input);
		displayIntArray(output);

		input = new int[]{9, 9};
		output = solution.plusOne(input);
		displayIntArray(output);

		input = new int[]{1, 2, 3};
		output = solution.plusOne(input);
		displayIntArray(output);
		
	}
	
	public static void displayIntArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}