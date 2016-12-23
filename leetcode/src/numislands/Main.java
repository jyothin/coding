package numislands;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		char[][] input;
		int output;
		
		input = new char[][] {
			{'1','1','1','1','0'},
			{'1','1','0','1','0'},
			{'1','1','0','0','0'},
			{'0','0','0','0','0'}
		};
		output = s.numIslands(input);
		System.out.println(output);
		
		input = new char[][] {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}
		};
		output = s.numIslands(input);
		System.out.println(output);		
		
		input = new char[][] {};
		output = s.numIslands(input);
		System.out.println(output);
		
		input = new char[][] {
			{'1','1','1'},
			{'0','1','0'},
			{'1','1','1'}
		};
		output = s.numIslands(input);
		System.out.println(output);
		
	}

}
