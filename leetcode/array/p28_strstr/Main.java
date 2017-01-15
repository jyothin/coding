package strstr;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int output;
		
		String haystack;
		String needle;
		
		haystack = "abbabccc";
		needle = "abc";
		output = solution.strStr(haystack, needle);
		System.out.println(output);		

		haystack = "";
		needle = "";
		output = solution.strStr(haystack, needle);
		System.out.println(output);		

	}

}
