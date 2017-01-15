package p103_zigzaglevelorder;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	
    	List<List<Integer>> l = new ArrayList<List<Integer>>();
    	List<Integer> ll;

        
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    	
    	TreeNode node;
    	
    	if (root == null) {
    		return l;
    	}
    	
    	queue.add(root);
    	
    	while (!queue.isEmpty() || !stack.isEmpty()) {
	    	
	    	ll = new ArrayList<Integer>();
	    	while (queue.peek() != null) {
	    		node = queue.removeLast();
	    		if (node.left != null) {
	    			stack.add(node.left);
	    		}
	    		if (node.right != null) {
	    			stack.add(node.right);
	    		}
	    		ll.add(node.val);
	    	}
	    	//displayList(ll);
	    	if (!ll.isEmpty()) {
	    		l.add(ll);
	    	}
	    	
	    	ll = new ArrayList<Integer>();
	    	while (stack.peek() != null) {
	    		node = stack.removeLast();
	    		if (node.right != null) {
	    			queue.add(node.right);
	    		}
	    		if (node.left != null) {
	    			queue.add(node.left);
	    		}

	    		ll.add(node.val);
	    	}
	    	if (!ll.isEmpty()) {
	    		l.add(ll);
	    	}
    	}
    	
    	return l;
    	
    }
    
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { this.val = x; }
    }
    
    public TreeNode add(TreeNode r, TreeNode node) {
    	if (r == null) {
    		return  node;
    	}
    	TreeNode root = r;
    	while (root != null) {
	    	if (node.val < root.val) {
	    		if (root.left == null) {
	        		root.left = node;
	        		break;
	    		} else {
	    			root = root.left;
	    		}
	    	} else if (root.val < node.val) {
	    		if (root.right == null) {
	    			root.right = node;
	    			break;
	    		} else {
	    			root = root.right;
	    		}
	    	}
    	}
    	return r;
    }
    
    public void displayPreOrder(TreeNode root) {
    	if (root == null) { System.out.print("null"+":"); return; }
    	System.out.print(root.val+":");
    	displayPreOrder(root.left);
    	displayPreOrder(root.right);
    }
    
    public void displayInOrder(TreeNode root) {
    	if (root == null) { System.out.print("null"+":"); return; }
    	displayInOrder(root.left);
    	System.out.print(root.val+":");
    	displayInOrder(root.right);
    }
    
    public void displayList(List<Integer> ll) {
    	Iterator<Integer> iter = ll.iterator();
    	while (iter.hasNext()) {
    		System.out.print(iter.next().intValue()+": ");
    	}
    }
}

