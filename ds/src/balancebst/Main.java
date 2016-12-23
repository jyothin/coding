package balancebst;

import balancebst.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root;
		
		root = s.new TreeNode(4);
		root.left = s.new TreeNode(3);
		root.left.left = s.new TreeNode(2);
		root.left.left.left = s.new TreeNode(1);
		s.displayPreOrder(root);
		System.out.println();
		
		root = s.balancebst(root);
		
		s.displayPreOrder(root);
		System.out.println();

		root = s.new TreeNode(4);
		root.left = s.new TreeNode(3);
		root.left.left = s.new TreeNode(2);
		root.left.left.left = s.new TreeNode(1);
		root.right = s.new TreeNode(5);
		root.right.right = s.new TreeNode(6);
		root.right.right.right = s.new TreeNode(7);
		s.displayPreOrder(root);
		System.out.println();
		
		root = s.balancebst(root);
		
		s.displayPreOrder(root);
		System.out.println();

	}

}
