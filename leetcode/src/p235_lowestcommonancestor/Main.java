package p235_lowestcommonancestor;

import p235_lowestcommonancestor.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode output;
		TreeNode root;
		TreeNode node;
	
		root = null;
		node = null;
		output = solution.lowestCommonAncestor(root, node, node);
		if (output != null) {
			System.out.println(output.val);
		}
		
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
		
		TreeNode p = solution.new TreeNode(-1);
		TreeNode q = solution.new TreeNode(5);
		output = solution.lowestCommonAncestor(root, p, q);
		if (output != null) {
			System.out.println(output.val);
		}

	}

}
