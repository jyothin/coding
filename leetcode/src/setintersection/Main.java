package setintersection;

public class Main {

	public static void main(String[] args) {
		String[] input =  new String[]{"Software Engineer", "Mechanical Engineer", "S S E"};
		Solution solution =  new Solution(input);
		String output;

		//String rawTitle = new String("Software Engineer");
		//String rawTitle = new String("Mechanical Engineer, 100K USD");
		String rawTitle = new String("S S S E");
		output = solution.setIntersection(rawTitle);

		System.out.println(output);
	}

}
