package issametree;

import java.util.LinkedList;

public class Solution {
	public boolean isSameTree1(TreeNode p, TreeNode q) {
		
		if (p == null && q != null) { return false; }
		if (p != null && q == null) { return false; }
		
		TreeNode pTemp, qTemp;
		LinkedList<TreeNode> pList = new LinkedList<TreeNode>();
		LinkedList<TreeNode> qList = new LinkedList<TreeNode>();

		pList.add(p);
		qList.add(q);

		while (pList.peek() != null && qList.peek() != null) {
			pTemp = pList.pop();
			qTemp = qList.pop();
			
			System.out.println(pTemp.val+":"+qTemp.val);

			if (pTemp.val != qTemp.val) { return false; }

			if (pTemp.left != null) { pList.add(pTemp.left); }
			if (pTemp.right != null) { pList.add(pTemp.right); }

			if (qTemp.left != null) { qList.add(qTemp.left); }
			if (qTemp.right != null) { qList.add(qTemp.right); }

		}
		
		if (pList.size() != qList.size()) { return false; }
		
		return true;
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
	    if(p == null && q == null) return true;
	    if(p == null || q == null) return false;
	    if(p.val == q.val)
	        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	    return false;
	}
	
    public TreeNode add(TreeNode root, TreeNode node) {
    	if (root == null) { root = node; return root; }
    	TreeNode temp = root;
    	while (temp != null) {
    		if (node.val < temp.val) {
    			if (temp.left != null) { temp = temp.left; }
    			else { temp.left = node; break; }
    		} else {
    			if (temp.right != null) { temp = temp.right; }
    			else { temp.right = node; break; }
    		}
    	}
    	return root;
    }
    
    public void displayInOrder(TreeNode root) {
    	if (root == null) { return; }
    	displayInOrder(root.left);
    	System.out.print(root.val+", ");
    	displayInOrder(root.right);
    }
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
}
