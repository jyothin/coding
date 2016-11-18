package atoi;

public class Solution {
    public int myAtoi(String str) {
        
    	int len = str.length();
    	int digit = 0;
    	int multiplier = 0;
    	long number = 0;
    	int minus = +1;
    	boolean symbol = false;

    	if (len == 0) { return 0; }
    	
    	StringBuilder sb = new StringBuilder();
    	String newStr = "";
    	int i = 0;
    	while (i < len) {
    		if (str.charAt(i) == " ".charAt(0) && symbol) { return 0; }
    		if (str.charAt(i) == " ".charAt(0) && sb.length() == 0) { i++; continue; }
    		if (str.charAt(i) == "-".charAt(0) && sb.length() == 0) {
    			if (symbol) { return 0; }
    			symbol = true;
    			minus = -1;
    			i++;
    			continue;
    		}
    		if (str.charAt(i) == "+".charAt(0) && sb.length() == 0) {
    			if (symbol) { return 0; }
    			symbol = true;
    			i++;
    			continue;
    		}
    		if ((str.charAt(i) == "-".charAt(0) || str.charAt(i) == "+".charAt(0)) && sb.length() == 0) { 
    			if (symbol) { return 0; }
    			symbol = true;
    		}
    		if (str.charAt(i) == "0".charAt(0) && sb.length() == 0) { 
    			i++;
    			continue;
    		}
    		if (str.charAt(i) < 0x30 || str.charAt(i) > 0x39) {
    			if (symbol && sb.length() == 0) { return 0; }
    			break;
    			/*if (sb.length() != 0) {
    				break;
    			} else {
    				i++;
    				continue;
    			}*/
    		}
    		sb.append(str.charAt(i));
    		//System.out.println(sb.toString());
    		i++;
    	}
    	newStr = sb.toString();
    	//System.out.println(newStr);
    	
    	len = newStr.length();
    	for (i=0; i<len; i++) {
    		char c = newStr.charAt(i);
    		digit = c - 0x30;
    		multiplier = (int) Math.pow(10, (len-1-i));
    		number += (digit * multiplier);
    		//System.out.println(c+":"+digit+":"+multiplier+":"+number);
    	}
    	
    	number *= minus;
    	
    	if (number < Integer.MIN_VALUE) { return Integer.MIN_VALUE; }
    	if (number > Integer.MAX_VALUE) { return Integer.MAX_VALUE; }
    	
    	return (int) number;
    }
    
    public int myAtoi2(char[] str) {
        int sign = 1, base = 0, i = 0;
        while (str[i] == ' ') { i++; }
        if (str[i] == '-' || str[i] == '+') {
            //sign = 1 - 2 * (str[i++] == '-'); 
        }
        while (str[i] >= '0' && str[i] <= '9') {
            if (base >  Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str[i] - '0' > 7)) {
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            base  = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
}
