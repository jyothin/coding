package ispoweroftwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if (n == 0) return false;
    	if (n == 0x80000000) return false;
    	int powerOfTwo = 1;
        for (int i=0; i<32; i++) {
        	if ((n | powerOfTwo) == powerOfTwo) {
        		return true;
        	}
        	powerOfTwo = powerOfTwo << 1;
        }
        return false;
    }
}
