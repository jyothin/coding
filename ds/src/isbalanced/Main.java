package isbalanced;

import isbalanced.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root;
		boolean output;
		
		root = s.new TreeNode(4);
		root.left = s.new TreeNode(3);
		root.left.left = s.new TreeNode(2);
		root.left.left.left = s.new TreeNode(1);
		output = s.isBalanced(root);
		System.out.println(output);
		
		root = s.new TreeNode(3);
		root.left = s.new TreeNode(1);
		root.left.right = s.new TreeNode(2);
		root.right = s.new TreeNode(4);
		output = s.isBalanced(root);
		System.out.println(output);
		

	}

}
