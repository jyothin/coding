package lengthoflis;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] input = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
		int output;
		
		output = solution.lengthOfLIS(input);
		System.out.println(output);
		

	}

}
