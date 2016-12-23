package twosum;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input;
		int[] output;
		
		input = new int[] {2, 7, 11, 15};
		output = s.twoSum(input, 22);
		System.out.println(output[0]+", "+output[1]);
		

	}

}
