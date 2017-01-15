package p73_setzeros;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] input;
		
		/*input = new int[][] {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};*/
		input = new int[][] {
			{0, 0, 0, 5},
			{4, 3, 1, 4},
			{0, 1, 1, 4},
			{1, 2, 1, 3},
			{0, 0, 1, 1}
		};
		int rows = input.length;
		int cols = input[0].length;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(input[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println();
		s.setZeroes(input);
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(input[i][j]+", ");
			}
			System.out.println();
		}
		

	}

}
