package p285_inordersuccessor;

import p285_inordersuccessor.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode output;
		
		TreeNode root = s.new TreeNode(100);
		root.left = s.new TreeNode(10);
		root.left.left = s.new TreeNode(1);
		root.left.left.right = s.new TreeNode(5);
		root.right = s.new TreeNode(200);
		
		TreeNode input = s.new TreeNode(5);

		output = s.inorderSuccessor(root, input);
		System.out.println(output.val);
		
		output = s.inorderPredecessor(root, input);
		System.out.println(output.val);

	}

}
