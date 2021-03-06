package p114_flatten;

import p114_flatten.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();

		TreeNode root = s.new TreeNode(100);
		root.right = s.new TreeNode(200);
		root.left = s.new TreeNode(10);
		root.left.left = s.new TreeNode(1);
		root.left.left.right = s.new TreeNode(5);
		
		TreeNode node = root;
		while (node != null) {
			System.out.println(node.val);
			node = node.right;
		}
		
		s.flatten(root);
		
		while (root != null) {
			System.out.println(root.val);
			root = root.right;
		}
		
	}

}
