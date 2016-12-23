package inordertraversal;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	traversal(root, list);
    	return list;
    }
    
    public void traversal(TreeNode root, List<Integer> list) {
    	if (root == null) { return; }
    	traversal(root.left, list);
    	list.add(root.val);
    	traversal(root.right, list);
    }
    
    public class TreeNode {
    	 int val;
    	 TreeNode left;
    	 TreeNode right;
    	 TreeNode(int x) { val = x; }
    }
}
