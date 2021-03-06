package p171p168_titletonumber;

import java.util.HashMap;

public class Solution {
    public int titleToNumber(String s) {
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	createMap(map);
        int len = s.length();
        int index = 0;
        int sum = 0;
        while (index < len-1) {
        	sum += (map.get(s.charAt(index))*Math.pow(26, (len-index-1)));
        	index++;
        }
        sum += (map.get(s.charAt(index)));
        return sum;
    }
    
    public String convertToTitle(int n) {
    	String s = "";
    	
    	while (n > 0) {
    		n--;
    		s += (char) ('A' + (n % 26));
    		n /= Math.pow(26, 1);
    	}
    	return reverse(s);
    	// return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
    
    public String reverse(String s) {
    	String r = "";
    	for (int i=s.length()-1; i>=0; i--) {
    		r += s.charAt(i);
    	}
    	return r;
    }
    
    public void createMap(HashMap<Character, Integer> map) {
    	map.put("A".charAt(0), 1);
    	map.put("B".charAt(0), 2);
    	map.put("C".charAt(0), 3);
    	map.put("D".charAt(0), 4);
    	map.put("E".charAt(0), 5);
    	map.put("F".charAt(0), 6);
    	map.put("G".charAt(0), 7);
    	map.put("H".charAt(0), 8);
    	map.put("I".charAt(0), 9);
    	map.put("J".charAt(0), 10);
    	map.put("K".charAt(0), 11);
    	map.put("L".charAt(0), 12);
    	map.put("M".charAt(0), 13);
    	map.put("N".charAt(0), 14);
    	map.put("O".charAt(0), 15);
    	map.put("P".charAt(0), 16);
    	map.put("Q".charAt(0), 17);
    	map.put("R".charAt(0), 18);
    	map.put("S".charAt(0), 19);
    	map.put("T".charAt(0), 20);
    	map.put("U".charAt(0), 21);
    	map.put("V".charAt(0), 22);
    	map.put("W".charAt(0), 23);
    	map.put("X".charAt(0), 24);
    	map.put("Y".charAt(0), 25);
    	map.put("Z".charAt(0), 26);
    }
    
    public void createReverseMap(HashMap<Integer, Character> reverseMap) {
    	reverseMap.put(1, "A".charAt(0));
    	reverseMap.put(2, "B".charAt(0));
    	reverseMap.put(3, "C".charAt(0));
    	reverseMap.put(4, "D".charAt(0));
    	reverseMap.put(5, "E".charAt(0));
    	reverseMap.put(6, "F".charAt(0));
    	reverseMap.put(7, "G".charAt(0));
    	reverseMap.put(8, "H".charAt(0));
    	reverseMap.put(9, "I".charAt(0));
    	reverseMap.put(10, "J".charAt(0));
    	reverseMap.put(11, "K".charAt(0));
    	reverseMap.put(12, "L".charAt(0));
    	reverseMap.put(13, "M".charAt(0));
    	reverseMap.put(14, "N".charAt(0));
    	reverseMap.put(15, "O".charAt(0));
    	reverseMap.put(16, "P".charAt(0));
    	reverseMap.put(17, "Q".charAt(0));
    	reverseMap.put(18, "R".charAt(0));
    	reverseMap.put(19, "S".charAt(0));
    	reverseMap.put(20, "T".charAt(0));
    	reverseMap.put(21, "U".charAt(0));
    	reverseMap.put(22, "V".charAt(0));
    	reverseMap.put(23, "W".charAt(0));
    	reverseMap.put(24, "X".charAt(0));
    	reverseMap.put(25, "Y".charAt(0));
    	reverseMap.put(0, "Z".charAt(0));
    }
}
