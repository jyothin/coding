package eval;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		String input = "((1+(5*6))*2)";
		double output;
		
		output = s.evaluate(input);
		System.out.println(output);
		
		
	}

}