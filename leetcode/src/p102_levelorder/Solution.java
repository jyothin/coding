package p102_levelorder;

import java.util.List;

import java.util.LinkedList;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) { return list; }

        LinkedList<TreeNode> queue1 = new LinkedList<TreeNode>();
        queue1.add(root);
        LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> queue;
        
        TreeNode node;

        while (queue1.peek() != null || queue2.peek() != null) {
            List<Integer> l = new ArrayList<Integer>();
	        while (queue1.peek() != null) {
	        	node = queue1.pop();
	        	l.add(node.val);
	        	if (node.left != null) { queue2.add(node.left); }
	        	if (node.right != null) { queue2.add(node.right); }
	        }
	        list.add(l);
	    	queue = queue1;
	    	queue1 = queue2;
	    	queue2 = queue;
        }
        
        return list;

    }
    
    public class TreeNode {
    	 int val;
    	 TreeNode left;
    	 TreeNode right;
    	 TreeNode(int x) { val = x; }
    }
}
