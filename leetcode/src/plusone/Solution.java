package plusone;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public int[] plusOne(int[] digits) {
        
    	int digit, newDigit;
    	ArrayList<Integer> newDigits = new ArrayList<Integer>();

    	int carry = 0;
    	int i = digits.length-1;
    	while (i > -1) {
    		digit = digits[i];
    		if (i == digits.length-1) { newDigit = carry + digit + 1; }
    		else { newDigit = carry + digit; }
    		if (newDigit > 9) { carry = 1; }
    		else {carry = 0; }
    		newDigits.add(0, newDigit % 10);
    		i--;
    	}
    	
    	if (carry == 1) { newDigits.add(0, 1); }
    	
    	return convertToIntArray(newDigits);
    }
    
    public int[] convertToIntArray(ArrayList<Integer> newDigits) {
    	int[] ret = new int[newDigits.size()];
    	Iterator<Integer> iterator = newDigits.iterator();
    	for (int i=0; i<newDigits.size(); i++) {
    		ret[i] = iterator.next().intValue();
    	}
    	return ret;
    }
}
