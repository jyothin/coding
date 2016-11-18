package maxdepth;

import maxdepth.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int output;
		TreeNode root;
		TreeNode node;
		
		root = null;
		output = solution.maxDepth(root);
		System.out.println(output);
		
		node = solution.new TreeNode(100);
		root = solution.add(root, node);
		output = solution.maxDepth(root);
		System.out.println(output);
		
		node = solution.new TreeNode(10);
		solution.add(root, node);
		output = solution.maxDepth(root);
		System.out.println(output);
		
		node = solution.new TreeNode(200);
		root = solution.add(root, node);
		output = solution.maxDepth(root);
		System.out.println(output);

		node = solution.new TreeNode(1);
		root = solution.add(root, node);
		output = solution.maxDepth(root);
		System.out.println(output);

		node = solution.new TreeNode(-1);
		root = solution.add(root, node);
		output = solution.maxDepth(root);
		System.out.println(output);
		
		node = solution.new TreeNode(5);
		root = solution.add(root, node);
		output = solution.maxDepth(root);
		System.out.println(output);


	}

}
