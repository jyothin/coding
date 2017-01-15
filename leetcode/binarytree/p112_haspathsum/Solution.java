package haspathsum;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) { return false; }
        if ((sum - root.val) == 0 && root.left == null && root.right == null) { return true; }
    	return hasPathSum(root.left, sum-root.val) | hasPathSum(root.right, sum-root.val);
    }
    
    public TreeNode add(TreeNode root, TreeNode node) {
    	if (root == null) { root = node; return root; }
    	TreeNode temp = root;
    	while (temp != null) {
    		if (node.val < temp.val) {
    			if (temp.left != null) { temp = temp.left; }
    			else { temp.left = node; break; }
    		} else {
    			if (temp.right != null) { temp = temp.right; }
    			else { temp.right = node; break; }
    		}
    	}
    	return root;
    }
    
    public void displayInOrder(TreeNode root) {
    	if (root == null) { return; }
    	displayInOrder(root.left);
    	System.out.print(root.val+", ");
    	displayInOrder(root.right);
    }
    
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
}
