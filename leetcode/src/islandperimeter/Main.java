package islandperimeter;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] input = new int[][] {
			{0,1,0,0},
			{1,1,1,0},
			{0,1,0,0},
			{1,1,0,0}
		};
		
		int output;
		
		output = solution.islandPerimeter(input);
		System.out.println(output);

	}

}
