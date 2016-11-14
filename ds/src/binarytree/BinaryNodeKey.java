package binarytree;

public class BinaryNodeKey {
	public char key;
	public int data;
	BinaryNodeKey left;
	BinaryNodeKey right;
	int level;

	public BinaryNodeKey(char k, int d) {
		key = k;
		data = d;
		left = null;
		right = null;
		level = -1;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(key);
		sb.append(":");
		sb.append(data);
		sb.append(" ");
		return sb.toString();
	}
}
