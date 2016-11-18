package issametree;

import issametree.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		boolean output;
		TreeNode root1, root2;
		TreeNode node;
		
		root1 = null;
		root2 = null;
		output = solution.isSameTree(root1, root2);
		System.out.println(output);
		
		node = solution.new TreeNode(100);
		root1 = solution.add(root1, node);
		output = solution.isSameTree(root1, node);
		System.out.println(output);
		
		node = solution.new TreeNode(10);
		root1 = solution.add(root1,node);
		output = solution.isSameTree(root1, node);
		System.out.println(output);

		node = solution.new TreeNode(1);
		root1 = solution.add(root1, node);
		node = solution.new TreeNode(-1);
		root1 = solution.add(root1, node);
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
		
		
	}

}
