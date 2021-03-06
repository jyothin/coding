package haspathsum;

import haspathsum.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		boolean output;
		TreeNode root;
		TreeNode node;
		
		root = null;
		output = solution.hasPathSum(root, 100);
		System.out.println(output);
		
		node = solution.new TreeNode(100);
		root = solution.add(root, node);
		output = solution.hasPathSum(root, 100);
		System.out.println(output);
		
		node = solution.new TreeNode(10);
		root = solution.add(root, node);
		output = solution.hasPathSum(root, 100);
		System.out.println(output);
		
		node = solution.new TreeNode(1);
		root = solution.add(root, node);
		output = solution.hasPathSum(root, 111);
		System.out.println(output);
		
		node = solution.new TreeNode(-1);
		root = solution.add(root, node);
		output = solution.hasPathSum(root, 111);
		System.out.println(output);
		solution.displayInOrder(root);
		
		/*
		node = solution.new TreeNode(200);
		root1 = solution.add(root1, node);
		node = solution.new TreeNode(5);
		root1 = solution.add(root1, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		
		node = solution.new TreeNode(100);
		root2 = solution.add(root2, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		node = solution.new TreeNode(10);
		root2 = solution.add(root2, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		node = solution.new TreeNode(1);
		root2 = solution.add(root2, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		node = solution.new TreeNode(-1);
		root2 = solution.add(root2, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		node = solution.new TreeNode(5);
		root2 = solution.add(root2, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		node = solution.new TreeNode(200);
		root2 = solution.add(root2, node);
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		
		//solution.displayInOrder(root1);
		//System.out.println();
		//solution.displayInOrder(root2);
		//System.out.println();
		*/
		
	}

}
