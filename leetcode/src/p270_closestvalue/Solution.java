package p270_closestvalue;

public class Solution {
    public int closestValue(TreeNode root, double target) {
    	
    	int closestVal = root.val;
    	while (root != null) {
    		if (Math.abs(target - root.val) < Math.abs(target - closestVal)) {
    			closestVal = root.val;
    		}
    		if (target < root.val) {
    			root = root.left;
    		} else {
    			root = root.right;
    		}
    	}
    	return closestVal;
    			
    	/*
    	double diff1 = Math.abs(root.val - target);
    	double diff2;
        if (target < root.val) {
    		diff2 = Double.MAX_VALUE;
        	if (root.left != null) {
        		diff2 = Math.abs(root.left.val - target);
	        	if (diff1 > diff2) {
	        		return closestValue(root.left, target);
	        	}
        	}
        } else if (root.val < target) {
    		diff2 = Double.MAX_VALUE;
        	if (root.right != null) {
        		diff2 = Math.abs(target - root.right.val);
	        	if (diff1 > diff2) {
	        		return closestValue(root.right, target);
	        	}
        	}
        }
        return root.val;
        */
    }
    
    public int closestValue2(TreeNode root, double target) {
        int closestVal = root.val; 
        while(root != null){ 
            //update closestVal if the current value is closer to target
            closestVal = (Math.abs(target - root.val) < Math.abs(target - closestVal))? root.val : closestVal;
            if(closestVal == target){   //already find the best result
                return closestVal;
            }
            root = (root.val > target)? root.left: root.right;   //binary search
        }
        return closestVal;
  }
    
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }
    
}
