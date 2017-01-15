package p235_lowestcommonancestor;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if (root != null && p != null && q != null) {
	        if (p.val < root.val && q.val < root.val) {
	        	return lowestCommonAncestor(root.left, p, q);
	        } else if (p.val > root.val && q.val > root.val) {
	        	return lowestCommonAncestor(root.right, p, q);
	        } else {
	        	return root;
	        }
    	} else {
    		return null;
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
    
    public class TreeNode {
    	 int val;
    	 TreeNode left;
    	 TreeNode right;
    	 TreeNode(int x) { val = x; }
    }
}
