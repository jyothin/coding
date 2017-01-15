package strstr;

public class Solution {
    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    
    public int strStr(String haystack, String needle) {
    	int i=0;
    	int j=0;
    	for (i=0; ; i++) {
	    	for (j=0; ; j++) {
	    		if (j == needle.length()) { return i; }
	    		if (i+j == haystack.length()) { return -1; }
	    		if (needle.charAt(j) != haystack.charAt(i+j)) {
	    			break;
	    		}
	    	}
    	}
    }
    
}
