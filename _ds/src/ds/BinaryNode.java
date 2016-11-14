package ds;

public class BinaryNode {
    int value;
    BinaryNode left;
    BinaryNode right;
    int level;

    public BinaryNode(int v) {
        value = v;
        left = null;
        right = null;
        level = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" ");
        return sb.toString();
    }

}
