package removeduplicates;

public class Main {

	public static void main(String[] args) {
		//0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 7, 8
		int[] a = new int[] {0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 7};
		Solution solution = new Solution();
		int output = solution.removeDuplicates(a);
		System.out.print(output);
	}

}
