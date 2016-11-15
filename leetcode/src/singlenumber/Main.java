package singlenumber;

public class Main {

	public static void main(String[] args) {
		int[] input = new int[] {1, 2, 3, 4, 1, 5, 6, 2, 3, 5, 6};
		Solution solution = new Solution();
		int output = solution.singleNumber(input);
		System.out.println(output);
	}

}
