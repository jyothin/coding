package reversevowels;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseVowels(String s) {
        
    	int l = 0;
    	int u = s.length() - 1;
    	char[] sc = s.toCharArray();
    	List<Character> vowels = new ArrayList<Character>();
    	vowels.add("a".charAt(0));
    	vowels.add("e".charAt(0));
    	vowels.add("i".charAt(0));
    	vowels.add("o".charAt(0));
    	vowels.add("u".charAt(0));
    	vowels.add("A".charAt(0));
    	vowels.add("E".charAt(0));
    	vowels.add("I".charAt(0));
    	vowels.add("O".charAt(0));
    	vowels.add("U".charAt(0));
    	
    	while (l < u) {
    		while (!vowels.contains(sc[l]) && l<s.length() && l<u) { l++; }
    		while (!vowels.contains(sc[u]) && u>0 && u>l) { u--; }
    		//System.out.println(l+":"+u);
    		char temp = sc[u];
    		sc[u] = sc[l];
    		sc[l] = temp;
    		//System.out.println(display(sc));
    		l++;
    		u--;
    	}
    	
    	return display(sc);
    	
    }
    
    public String display(char[] sc) {
    	StringBuilder sb = new StringBuilder();
    	for (int i=0; i<sc.length; i++) {
    		sb.append(sc[i]);
    	}
    	return sb.toString();
    }
}
