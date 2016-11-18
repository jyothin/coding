package isanagram;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram2(String s, String t) {
        
    	HashMap<Character, Integer> sHm = createHashMap(s);
    	HashMap<Character, Integer> tHm = createHashMap(t);
    	
    	if (sHm.size() != tHm.size()) {
    		return false;
    	}
    	
    	for (Character c: sHm.keySet()) {
    		if (sHm.get(c) != tHm.get(c)) {
    			return false;
    		}
    	}
    	
    	return true;
    	
    }
    
    public HashMap<Character, Integer> createHashMap(String s) {
    	HashMap<Character, Integer> hm = new HashMap<>();
    	for (int i=0; i<s.length(); i++) {
    		char c = s.charAt(i);
    		if (hm.containsKey(c)) {
    			hm.put(c, hm.get(c)+1);
    		} else {
    			hm.put(s.charAt(i), 1);
    		}
    	}
    	return hm;
    }
    
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) {
          alphabet[t.charAt(i) - 'a']--;
          if(alphabet[t.charAt(i) - 'a'] < 0) return false;
        }
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
