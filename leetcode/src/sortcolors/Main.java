package sortcolors;

public class Main {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		int[] input = new int[] {2, 2, 1, 0, 0, 0};
		//solution.sortColors(input);
		solution.sortColors2(input);
		
		for (int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}
		System.out.println();

	}

}
