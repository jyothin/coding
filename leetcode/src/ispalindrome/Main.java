package ispalindrome;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		String input;
		boolean output;
		
		input = "A man, a plan, a canal: Panama";
		output = s.isPalindrome(input);
		System.out.println(output);
		
		input = "race a car";
		output = s.isPalindrome(input);
		System.out.println(output);
		
		input = "0P";
		output = s.isPalindrome(input);
		System.out.println(output);
		
		input = "ab2a";
		output = s.isPalindrome(input);
		System.out.println(output);
		
		
	}

}
