package isperfectsquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        
    	if (num == 0) { return false; }
    	if (num == 1) { return true; }
    	
    	long l = 0;
    	long u = num/2+1;
    	long m = -1;
    	
    	while (l < u) {
    		m = l + (u-l)/2;
    		long s = (long) Math.pow(m, 2);
    		//System.out.println(l+":"+m+":"+u+":"+s);
    		if (s == num) { return true; }
    		if (s < num) { l = m+1; }
    		if (s > num) { u = m; }
    	}
    	return false;
    	
    }
}
