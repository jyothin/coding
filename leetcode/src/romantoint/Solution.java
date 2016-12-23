package romantoint;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(" ".charAt(0), 0);
        map.put("I".charAt(0), 1);
        map.put("V".charAt(0), 5);
        map.put("X".charAt(0), 10);
        map.put("L".charAt(0), 50);
        map.put("C".charAt(0), 100);
        map.put("D".charAt(0), 500);
        map.put("M".charAt(0), 1000);
        int i=0;
        int number = 0;
        while (i < s.length()) {
        	char c = s.charAt(i);
        	char n = " ".charAt(0);
        	if (i+1 < s.length()) {
        		n = s.charAt(i+1);
        	}
        	if (map.get(c) >= map.get(n)) {
        		number += map.get(c);
        		i++;
        	} else {
        		number += (map.get(n) - map.get(c));
        		i += 2;
        	}
        }
        return number;
    }
}