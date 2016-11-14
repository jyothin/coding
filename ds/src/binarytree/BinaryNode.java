package binarytree;

public class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;
	int level;

	public BinaryNode(int d) {
		data = d;
		left = null;
		right = null;
		level = -1;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(data);
		sb.append(" ");
		return sb.toString();
	}
}
