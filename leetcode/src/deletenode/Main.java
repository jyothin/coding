package deletenode;

import java.util.LinkedList;

import deletenode.Solution;
import deletenode.Solution.TreeNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root = null, node;
		
		//Integer[] input = new Integer[] {3, 9, 20, null, null, 15, 7};
		//Integer[] input = new Integer[] {};
		Integer[] input = new Integer[] {5, 3, 6, 2, 4, null, 7};
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
				if (input[count] != null) {
					node.right = s.new TreeNode(input[count].intValue());
					queue.add(node.right);
				}
				count++;
			}
		}
				
		s.displayPreOrder(root);
		System.out.println();

		root = s.deleteNode(root, 3);
		s.displayPreOrder(root);

	}

}
