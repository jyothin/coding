package p121_maxprofit;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input = new int[] {7, 1, 5, 3, 6, 4};
		int output;
		
		output = s.maxProfit2(input);
		System.out.println(output);
		
		input = new int[] {7, 6, 4, 3, 1};
		System.out.println(s.maxProfit2(input));
		
		input = new int[] {2, 4, 1};
		System.out.println(s.maxProfit2(input));
		

	}

}
