package freqsort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import binarytree.BinaryTree;

public class FreqSort {
	
	public FreqSort() {
		
	}
	
	public static void displayHashMap(HashMap<Character, Integer> hm) {
		Set<Character> keySet = hm.keySet();
		java.util.Iterator<Character> i = keySet.iterator();
		Character c;
		while (i.hasNext()) {
			c = i.next();
			System.out.println(c+": "+hm.get(c));
		}
	}
	
	public static String sort(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count;
		for (int i=0; i<s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				count = hm.get(s.charAt(i));
			} else {
				count = 0;
			}
			count++;
			hm.put(s.charAt(i), count);
		}
		displayHashMap(hm);
		
		BinaryTree bt = new BinaryTree();
		Character k;
		for (Iterator<Character> i = hm.keySet().iterator(); i.hasNext();) {
			k = i.next();
			bt.insert(k, hm.get(k));
		}
		bt.displayBreadthFirst();
		bt.heapSort();
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return sb.toString();
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Invalid arguments");
		} else if (args[0].equals("")) {
			System.out.println("Empty input");
		} else {
			sort(args[0]);
		}
	}

}
