package lengthoflongestsubstring;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String input = "abcabcbb";
		System.out.println(solution.lengthOfLongestSubstring(input));
		
		input = "bbbbb";
		System.out.println(solution.lengthOfLongestSubstring(input));
		
		input = "pwwkew";
		System.out.println(solution.lengthOfLongestSubstring(input));
		
		input = "";
		System.out.println(solution.lengthOfLongestSubstring(input));
		
		input = "ivkhfxbqaquyetwifthnsxrggoqbhxiqsvzzscqutmszfqjnmtaeqtmykcbr";
		System.out.println(solution.lengthOfLongestSubstring(input));

	}

}
