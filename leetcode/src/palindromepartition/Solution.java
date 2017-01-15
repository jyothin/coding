package palindromepartition;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lList = new ArrayList<>();
        backtrack(lList, new ArrayList<String>(), s, 0);
        return lList;
    }
    
    public void backtrack(List<List<String>> lList, List<String> tempString, String s, int start) {
    	if (start == s.length()) {
    		lList.add(new ArrayList<>(tempString));
    	} else {
    		for (int i=start; i<s.length(); i++) {
				if (isPalindrome(s, start, i)) {
					tempString.add(s.substring(start, i+1));
					backtrack(lList, tempString, s, i+1);
					tempString.remove(tempString.size() - 1);
				}
    			
    		}
    	}
    }
    
    public boolean isPalindrome(String s, int left, int right) {
    	while (left < right) {
    		if (s.charAt(left++) != s.charAt(right--)) { return false; }
    	}
    	return true;
    }
}
