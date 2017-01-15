package p55_canjump;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input = new int[] {2, 3, 1, 1, 4};
		boolean output;
		
		output = s.canJump(input);
		System.out.println(output);
		
		input = new int[] {3, 2, 1, 0, 4};
		output = s.canJump(input);
		System.out.println(output);
		
		input = new int[] {2, 0};
		output = s.canJump2(input);
		System.out.println(output);

	}

}
