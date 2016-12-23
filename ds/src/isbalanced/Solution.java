package isbalanced;

public class Solution {
	public boolean isBalanced (TreeNode root) {
		if (root == null) { return true; }
		int diff;
		diff = Math.abs(getHeight(root.left) - getHeight(root.right));
		if (diff > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	public int getHeight(TreeNode root) {
		if (root == null) { return 0; }
		return (1+Math.max(getHeight(root.left), getHeight(root.right)));
	}
	
    public class TreeNode {
    	 int val;
    	 TreeNode left;
    	 TreeNode right;
    	 TreeNode(int x) { val = x; }
    }
}
