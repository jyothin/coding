package p419_countbattleships;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int output;
		
		char[][] input = new char[][] {
			{'X', '.', '.', 'X'},
			{'.', '.', '.', 'X'},
			{'.', '.', '.', 'X'}
		};
		
		output = s.countBattleships(input);
		System.out.println(output);

	}

}
