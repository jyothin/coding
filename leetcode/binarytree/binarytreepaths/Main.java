package binarytreepaths;

import java.util.List;

import binarytreepaths.Solution.TreeNode;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<String> output;
		TreeNode root;
		TreeNode node;
		
		root = null;
		output = solution.binaryTreePaths(root);
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
		
		solution.displayInOrder(root);
		
		output = solution.binaryTreePaths(root);
		System.out.println(output);
		
		
	}
}
