package reversevowels;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String output;
		
		output = solution.reverseVowels("hello");
		System.out.println(output);
		
		output = solution.reverseVowels("leetcode");
		System.out.println(output);
		
		output = solution.reverseVowels("aA");
		System.out.println(output);
		

	}

}
