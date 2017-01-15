package p285_inordersuccessor;

public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    	if (root == null) {
    		return null;
    	}
    	
    	if (root.val <= p.val) {
    		return inorderSuccessor(root.right, p);
    	} else {
    		TreeNode left = inorderSuccessor(root.left, p);
    		return (left != null) ? left: root;
    	}
    }
    
    public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
    	if (root == null) {
    		return null;
    	}
    	
    	if (root.val >= p.val) {
    		return inorderPredecessor(root.left, p);
    	} else {
    		TreeNode right = inorderPredecessor(root.right, p);
    		return (right != null) ? right: root;
    	}
    }
    
    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        TreeNode succ = null;
        while (root != null) {
            if (p.val < root.val) {
                succ = root;
                root = root.left;
            }
            else
                root = root.right;
        }
        return succ;
    }

    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) {val = x;}
    }
}
