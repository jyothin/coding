package isvalidbst;

public class Solution {
    public boolean isValidBST2(TreeNode root) {
    
    	if (root == null) { return true; }
    	
    	if (root.left != null) {
    		if (root.left.val < root.val) { return isValidBST(root.left); }
    		else { return false; }
    	}
    	
    	if (root.right != null) {
    		if (root.val < root.right.val) { return isValidBST(root.right); }
    		else { return false; }
    	}

    	return false;
    }
    
    public boolean isValidBST(TreeNode root) {
        if(root ==  null) return  true;
        return helper(root.left, null, root.val) && helper(root.right, root.val, null);        
    }


    private boolean helper(TreeNode node, Integer loBound, Integer hiBound){
        if(node == null) return true;
        if(loBound != null && node.val <= loBound) return false;
        if(hiBound != null && node.val >= hiBound) return false;
        return helper(node.left, loBound, node.val) && helper(node.right, node.val, hiBound);   
    }
    
    public void change(TreeNode root, int val, int newVal) {
    	if (root != null) {
    		if (root.val == val) { root.val = newVal; }
    		else {
    			change(root.left, val, newVal);
    			change(root.right, val, newVal);
    		}
    	}
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
