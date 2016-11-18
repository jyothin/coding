package isanagram;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();

		String input1 = "anangram";
		String input2 = "naangram";
		System.out.println(solution.isAnagram(input1, input2));
		
		input1 = "rat";
		input2 = "car";
		System.out.println(solution.isAnagram(input1, input2));

	}

}
