package isbadversion;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int output = solution.firstBadVersion(2126753390);
		//                                    2147483647
		System.out.println(output);
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
	}

}
