package p238_productexceptself;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] output;
		
		int[] input = new int[] {1};
		output = s.productExceptSelf(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}

		input = new int[] {1, 2};
		output = s.productExceptSelf(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
		
		input = new int[] {1, 2, 3};
		output = s.productExceptSelf(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
		
		input = new int[] {1, 2, 3, 4};
		output = s.productExceptSelf(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
		
		input = new int[] {9, 0, -2};
		output = s.productExceptSelf(input);
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
