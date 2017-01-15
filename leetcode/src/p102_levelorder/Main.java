package p102_levelorder;

import java.util.List;

import p102_levelorder.Solution.TreeNode;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root;
		
		root = s.new TreeNode(3);
		root.left = s.new TreeNode(9);
		root.right = s.new TreeNode(20);
		root.right.left = s.new TreeNode(15);
		root.right.right = s.new TreeNode(7);
		
		List<List<Integer>> list = s.levelOrder(root);
		Iterator<List<Integer>> iter1 = list.iterator();
		while (iter1.hasNext()) {
			Iterator<Integer> iter2 = iter1.next().iterator();
			while (iter2.hasNext()) {
				System.out.print(iter2.next().intValue()+", ");
			}
			System.out.println();
		}
		
	}

}
