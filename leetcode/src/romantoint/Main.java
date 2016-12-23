package romantoint;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		String input;
		int output;
		
		input = "I";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "III";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "IV";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "V";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "X";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "IX";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "LIV";
		output = s.romanToInt(input);
		System.out.println(output);
		
		input = "LXXIII";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "XC";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "DCCCXC";
		output = s.romanToInt(input);
		System.out.println(output);

		input = "MCMXCVI";
		output = s.romanToInt(input);
		System.out.println(output);
		

	}

}
