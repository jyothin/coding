package connect;

import java.util.LinkedList;

public class Solution {
    public void connect1(TreeLinkNode root) {
        TreeLinkNode node1;
        TreeLinkNode node2;
    	LinkedList<TreeLinkNode> queue1 = new LinkedList<TreeLinkNode>();
    	LinkedList<TreeLinkNode> queue2 = new LinkedList<TreeLinkNode>();
    	
    	if (root == null) { return; }
    	
    	queue1.add(root);
    	queue2.add(null);
    	
    	while (queue1.peek() != null) {
    		node1 = queue1.pop();
    		node2 = queue2.pop();
    		
    		node1.next = node2;
    		
    		if (node1.left != null && node1.right != null) {
	    		queue1.add(node1.left);
	    		queue1.add(node1.right);
    		
	    		queue2.add(node1.right);
	    		
	    		if (node2 == null) {
	    			queue2.add(null);
	    		} else {
	    			queue2.add(node2.left);
	    			queue2.add(node2.right);
	    		}
    		}   		
    		/*
    		if (node1.val == node2.val) { 
    			node1.next = null; 
    		} else if (node1.val < node2.val) {
    			node1.next = node2;
    		} else {
    			node1.next = null;
    		}

    		if (node1.left != null) {
    			queue1.add(node1.left);
    			queue2.add(node1.right);
    		}
    		if (node1.right != null) {
    			queue1.add(node1.right);
    			queue2.add(node1.left);
    		}
    		*/
    	}
    }
    
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode pre = root;
        TreeLinkNode cur = null;
        while (pre.left != null) {
            cur = pre;
            while (cur != null) {
                cur.left.next = cur.right;
                if (cur.next != null) {
                	cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            pre = pre.left;
        }
    }
    
 	public class TreeLinkNode {
     	int val;
     	TreeLinkNode left, right, next;
     	TreeLinkNode(int x) { val = x; }
     }
}