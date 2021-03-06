package p114_flatten;

import java.util.Stack;

public class Solution {
    public void flatten1(TreeNode root) {
    	while (root != null) {
    		if (root.left != null && root.right != null) {
    			TreeNode t = root.left;
    			while (t.right != null) {
    				t = t.right;
    			}
    			t.right = root.right;
    		}
    		if (root.left != null) {
    			root.right = root.left;
    		}
			root.left = null;
			root = root.right;
    	}
    }
    
    public void flatten(TreeNode root) {
    	if (root == null) return;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root);
    	while (!stack.isEmpty()) {
    		TreeNode cur = stack.pop();
    		if (cur.right != null) {
    			stack.push(cur.right);
    		}
    		if (cur.left != null) {
    			stack.push(cur.left);
    		}
    		if (!stack.isEmpty()) {
    			cur.right = stack.peek();
    		}
    		cur.left = null;
    	}
    }
    
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
}
