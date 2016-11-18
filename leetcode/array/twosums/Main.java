package twosums;

public class Main {

	public static void main(String[] args) {
		int[] input = new int[] {2, 3, 4};
		int target = 6;
		Solution solution = new Solution();
		int[] output = solution.twoSum(input, target);
		System.out.print(output[0]+", "+output[1]);
	}

}
