package titletonumber;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		String input = new String();
		int output;
		
		input = "XYZ";
		output = s.titleToNumber(input);
		System.out.println(output);
		
		int i = 16900;
		String o;
		o = s.convertToTitle(i);
		System.out.println(o);
		

	}

}
