package lengthoflongestsubstring;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if (s.length() == 0) { return 0; }
    	int i=0;
    	int max=0;
    	String lss = s.substring(0, 1);
    	while (i<s.length()) {
        	int j=s.length();
        	HashMap<Character, Integer> hm = createHashMap(s.substring(i, j));
    		while (i < j) {
	    		String ss = s.substring(i, j);
	    		max = getMax(hm);
	    		//System.out.println("max = "+max);
	    		if (max != 1) {
	    			char c = ss.charAt(ss.length()-1);
	    			hm.put(c, hm.get(c)-1);
	    			j--;
	    		} else {
	    			if (lss.length() < ss.length()) {
	    				lss = ss;
	    			}
	    			break;
	    		}
    		}
    		i++;
    	}
    	//System.out.println(lss);
        return lss.length();
    }
    
    public HashMap<Character, Integer> createHashMap(String s) {
    	HashMap<Character, Integer> hm = new HashMap<>();
    	char c;
    	for (int i=0; i<s.length(); i++) {
    		c = s.charAt(i);
    		if (hm.containsKey(c)) {
    			hm.put(c, hm.get(c)+1);
    		} else {
    			hm.put(c, 1);
    		}
    	}
    	return hm;
    }
    	
	public int getMax(HashMap<Character, Integer> hm) {    	
    	int max=0;    	
    	for (Character ch: hm.keySet()) {
    		//System.out.print(ch+":"+hm.get(ch)+", ");
    		if (max < hm.get(ch)) {
    			max = hm.get(ch);
    		}
    	}
    	//System.out.println();
    	return max;
    }
    
}

