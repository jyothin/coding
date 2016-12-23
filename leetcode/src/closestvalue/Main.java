package closestvalue;

import java.util.LinkedList;

/*
Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:
Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.
*/

import closestvalue.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root = null, node;
		
		//Integer[] input = new Integer[] {3, 9, 20, null, null, 15, 7};
		//Integer[] input = new Integer[] {};
		//Integer[] input = new Integer[] {1, 2, 3, 4, null, null, 5};
		Integer[] input = new Integer[] {36,13,37,4,20,null,48,1,5,17,33,43,49,0,2,null,9,14,18,22,34,40,46,null,null,null,null,null,3,7,11,null,16,null,19,21,27,null,35,39,42,45,47,null,null,6,8,10,12,15,null,null,null,null,null,26,32,null,null,38,null,41,null,44,null,null,null,null,null,null,null,null,null,null,null,null,null,24,null,28,null,null,null,null,null,null,null,23,25,null,29,null,null,null,null,null,31,30};
		System.out.println(input.length);
		for (int i=0; i<input.length; i++) {
			if (input[i] != null) {
				System.out.print(input[i].intValue()+":");
			} else {
				System.out.print("null:");
			}
		}
		System.out.println();
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		
		if (input.length != 0) {
			
			int count = 0;
			root = s.new TreeNode(input[count].intValue());
			queue.push(root);
			count++;
	
			while (queue.peek() != null && count < input.length) {
				node = queue.pop();
				if (input[count] != null) {
					node.left = s.new TreeNode(input[count].intValue());
					queue.add(node.left);
				}
				count++;
				if (count < input.length && input[count] != null) {
					node.right = s.new TreeNode(input[count].intValue());
					queue.add(node.right);
				}
				count++;
			}
		}
		
		int output;
		output = s.closestValue(root, 3.142857);
		System.out.println(output);

	}

}
