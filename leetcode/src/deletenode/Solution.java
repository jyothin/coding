package deletenode;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) { return root; }
        
        if (key < root.val) { root.left = deleteNode (root.left, key); }
        else if (root.val < key) { root.right = deleteNode (root.right, key); }
        else {
        	if (root.left == null) { return root.right; }
        	else if (root.right == null) { return root.left; }
        	
        	root.val = minValue(root.right);
        	root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    
    public int minValue(TreeNode root) {
    	int minVal = root.val;
    	while (root.left != null) {
    		minVal = root.left.val;
    		root = root.left;
    	}
    	return minVal;
    }
    
    public void displayPreOrder(TreeNode root) {
    	if (root == null) { System.out.print("null"+":"); return; }
    	System.out.print(root.val+":");
    	displayPreOrder(root.left);
    	displayPreOrder(root.right);
    }
    
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { this.val = x; }
    }
}
