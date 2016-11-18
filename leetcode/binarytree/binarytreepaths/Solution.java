package binarytreepaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> binaryTreePaths(TreeNode root) {
		
	    List<String> paths = new ArrayList<String>();
	    StringBuilder sb = new StringBuilder();
	    
		buildPaths(root, paths, sb);
		
		return paths;
    }
	
	public void buildPaths(TreeNode root, List<String> paths, StringBuilder sb) {
		
		if (root == null) {
			return;
		}
		
		int len = sb.length();
		sb.append(root.val);
		
		if (root.left == null && root.right == null) {
			paths.add(sb.toString());
		} else {
			sb.append("->");
			buildPaths(root.left, paths, sb);
			buildPaths(root.right, paths, sb);
		}
		sb.setLength(len);
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
