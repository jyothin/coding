package p125_ispalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean iValid, jValid;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        
        if (i == j) {
        	return true;
        }
        
        while (i <= j) {
        	iValid = false;
        	jValid = false;
        	if (letters.contains(s.substring(i, i+1)) || Letters.contains(s.substring(i, i+1)) || numbers.contains(s.substring(i, i+1))) {
        		iValid = true;
        	} else {
        		i++;
        	}
        	
        	if (letters.contains(s.substring(j, j+1)) || Letters.contains(s.substring(j, j+1)) || numbers.contains(s.substring(j, j+1))) {
        		jValid = true;
        	} else {
        		j--;
        	}
        	        	
        	if (iValid && jValid) {
        		System.out.println(s.substring(i, i+1)+":"+s.substring(j, j+1));
        		if (!s.substring(i, i+1).equalsIgnoreCase(s.substring(j, j+1))) {
        			return false;
        		} else {
        			i++;
        			j--;
        		}
        	}
        	
        }
        
        return true;
        
    }
    
    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }

}
