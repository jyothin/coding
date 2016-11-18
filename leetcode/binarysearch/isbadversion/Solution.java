package isbadversion;

public class Solution {
    public int firstBadVersion2(int n) {	    	
    	return (int) helper(0, n);
    }
    
    public long helper(long l, long u) {
    	System.out.println(l+":"+u);

    	if (l == u) { return l; }
    	if (isBadVersion((int) (l + (u-l)/2)) ) {
    		return helper(l, l + (u-l)/2);
    	} else {
    		return helper((l + (u-l)/2) + 1, u);
    	}

    }
    
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;            
        }        
        return start;
    }
    
    public boolean isBadVersion(int v) {
    	if (v >= 1702766719) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
}
