package p215_findkthlargest;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int output;
		int[] input = new int[]{3, 2, 1, 5, 6, 4};
		int k = 2;
		
		output = s.findKthLargest(input, k);
		System.out.println(output);

	}

}
