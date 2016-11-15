package reversebits;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int output = solution.reverseBits(0x80000000);
		//int output = solution.reverseBits(43261596);
		System.out.print(output);
	}

}
