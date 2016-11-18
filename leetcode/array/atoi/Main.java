package atoi;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int output;
		
		String input = "";
		
		input = "";
		output = solution.myAtoi(input);
		System.out.println(output);

		input = "      ";
		output = solution.myAtoi(input);
		System.out.println(output);

		input = "-";
		output = solution.myAtoi(input);
		System.out.println(output);

		input = "+";
		output = solution.myAtoi(input);
		System.out.println(output);

		input = "+1";
		output = solution.myAtoi(input);
		System.out.println(output);

		input = "-1";
		output = solution.myAtoi(input);
		System.out.println(output);

		input = "+-1";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "010";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "    010";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "-01234567890";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "   12a234";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "2147483648";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "   - 321";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "  +b12102370352";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = "  -0012a42";
		output = solution.myAtoi(input);
		System.out.println(output);
		
		input = " b11228552307";
		output = solution.myAtoi(input);
		System.out.println(output);
		
	}

}
