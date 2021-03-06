package isvalidbst;

import isvalidbst.Solution.TreeNode;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		boolean output;
		TreeNode root;
		TreeNode node;
		
		root = null;
		output = solution.isValidBST(root);
		System.out.println(output);
		
		node = solution.new TreeNode(100);
		root = solution.add(root, node);
		
		node = solution.new TreeNode(10);
		root = solution.add(root, node);
		
		node = solution.new TreeNode(1);
		root = solution.add(root, node);
		
		node = solution.new TreeNode(-1);
		root = solution.add(root, node);
		
		node = solution.new TreeNode(5);
		root = solution.add(root, node);
		
		node = solution.new TreeNode(200);
		root = solution.add(root, node);
		
		solution.change(root, 1, -10);
		
		solution.displayInOrder(root);
		
		output = solution.isValidBST(root);
		System.out.println(output);
	}
}
