package guessgame;

public class Solution {
    public int guessNumber(int n) {
        
    	int l = 0;
    	int u = n;
    	int m = -1;
    	
    	while (l <= u) {
    		m = l + (u-l)/2;
    		System.out.println(l+":"+u+":"+m);
    		if (guess(m) == 0) { break; }
    		else if (guess(m) == -1) { u = l + (u-l)/2; }
    		else { l = m+1; }
    	}
    	return m;

    }
    
    int guess(int g) {
    	int num = 1;
    	if (g == num) { return 0; }
    	if (num > g) { return 1; }
    	else { return -1; }
    }
}
