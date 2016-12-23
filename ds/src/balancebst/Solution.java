package balancebst;

import java.util.ArrayList;

public class Solution {
	public TreeNode balancebst(TreeNode root) {
		ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
		buildNodes(root, nodes);
		
		int n = nodes.size();
		return buildTree(nodes, 0, n-1);
	}
	
	public void buildNodes(TreeNode root, ArrayList<TreeNode> nodes) {
		if (root == null) { return; }
		buildNodes(root.left, nodes);
		nodes.add(root);
		buildNodes(root.right, nodes);
	}
	
	public TreeNode buildTree(ArrayList<TreeNode> nodes, int start, int end) {
		if (start > end) { return null; }
		
		int mid = (start + end) / 2;
		TreeNode node = nodes.get(mid);
		node.left = buildTree(nodes, start, mid-1);
		node.right = buildTree(nodes, mid+1, end);
		return node;
	}
	
	public void displayPreOrder(TreeNode root) {
		if (root == null) { return; }
		System.out.print(root.val+", ");
		displayPreOrder(root.left);
		displayPreOrder(root.right);
	}
	
    public class TreeNode {
   	 int val;
   	 TreeNode left;
   	 TreeNode right;
   	 TreeNode(int x) { val = x; }
   }
	
}
