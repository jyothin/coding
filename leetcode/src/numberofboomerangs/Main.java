package numberofboomerangs;

public class Main {

	public static void main(String[] args) {
		// [[0,0],[1,0],[2,0]]
		Solution solution = new Solution();
		int[][] points = new int[][] {{0,0},{1,0},{2,0}};
		int count = solution.numberOfBoomerangs(points);
		System.out.println(count);
	}

}
