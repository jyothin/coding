package isperfectsquare;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		boolean output;
		
		output = solution.isPerfectSquare(16);
		System.out.println(output);
		
		output = solution.isPerfectSquare(14);
		System.out.println(output);		
		
		output = solution.isPerfectSquare(0);
		System.out.println(output);
		
		output = solution.isPerfectSquare(1);
		System.out.println(output);
		
		output = solution.isPerfectSquare(4);
		System.out.println(output);

		output = solution.isPerfectSquare(808201);
		System.out.println(output);
}
}
