package p451_frequencysort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public String frequencySort(String s) {
	    if (s == null) {
	        return null;
	    }
	    HashMap<Character, Integer> map = new HashMap<>();
	    char[] charArray = s.toCharArray();
	    int max = 0;
	    for (Character c : charArray) {
	        if (!map.containsKey(c)) {
	            map.put(c, 0);
	        }
	        map.put(c, map.get(c) + 1);
	        max = Math.max(max, map.get(c));
	    }
	
	    List<Character>[] array = buildArray(map, max);
	
	    return buildString(array);
	}

	private List<Character>[] buildArray(Map<Character, Integer> map, int maxCount) {
	    List<Character>[] array = new List<>[maxCount + 1];
	    for (Character c : map.keySet()) {
	        int count = map.get(c);
	        if (array[count] == null) {
	            array[count] = new ArrayList<>();
	        }
	        array[count].add(c);
	    }
	    return array;
	}

	private String buildString(List<Character>[] array) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = array.length - 1; i > 0; i--) {
	        List<Character> list = array[i];
	        if (list != null) {
	            for (Character c : list) {
	                for (int j = 0; j < i; j++) {
	                    sb.append(c);
	                }
	            }
	        }
	    }
	    return sb.toString();
	}
}

/*
public class Solution {
    public String frequencySort (String s) {
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
        //displayHashMap(hm);
        BinaryTree bt = new BinaryTree();
        Character k;
        for (Iterator<Character> i = hm.keySet().iterator(); i.hasNext(); ) {
            k = i.next();
            bt.insert(k, hm.get(k));
        }
        //System.out.println(bt.size);
        return bt.heapSort();
    }
    
    public void displayHashMap(HashMap<Character, Integer> hm) {
        Iterator<Character> i = hm.keySet().iterator();
        while (i.hasNext()) {
        	Character k = i.next();
            System.out.println(k+": "+hm.get(k));
        }
    }
*/
    /*
    public class BinaryTree {
        Node root;
        int size;

        public BinaryTree() {
            root = null;
            size = 0;
        }
        
        public void displayArrayList(ArrayList<Node> al) {
        	Iterator<Node> i = al.listIterator();
        	Node node;
        	while (i.hasNext()) {
        		node = i.next();
        		System.out.print(node.key+": "+node.value+"\n");
        	}
        }

        public void insert(char k, int v) {
            if (root == null) {
                root = new Node(k, v);
                return;
            }
            Node parent = null;
            Node temp = root;
            
            while (temp != null) {
                parent = temp;
                if (v < temp.value) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            Node node = new Node(k, v);
            if (v < parent.value) {
                parent.left = node;
            } else {
                parent.right =  node;
            }
            size++;
        }

        public void satisfyHeap(ArrayList<Node> al, int root, int heapSize) {
            int left = 2*root;
            int right = 2*root+1;
            int largest = root;
            if (left <= heapSize && al.get(left).value < al.get(largest).value) {
                largest = left;
            }
            if (right <= heapSize && al.get(right).value < al.get(largest).value) {
                largest = right;
            }
            Node temp;
            if (largest != root) {
                temp = al.get(root);
                al.set(root, al.get(largest));
                al.set(largest, temp);
                satisfyHeap(al, largest, heapSize);
            }
        }

        public void buildHeap(ArrayList<Node> al, int size) {
            int heapSize = size-1;
            for (int i=size/2; i>-1; i--) {
                satisfyHeap(al, i, heapSize);
            }
        }

        public String heapSort() {
            ArrayList<Node> al = new ArrayList<Node>();
            LinkedList<Node> queue = new LinkedList<Node>();
            queue.add(root);
            Node temp = root;
            while (queue.peek() != null) {
                temp = queue.remove();
                al.add(temp);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            //displayArrayList(al);
            buildHeap(al, al.size());
            int heapSize = al.size()-1;
            for (int i=heapSize; i>-1; i--) {
                temp = al.get(heapSize);
                al.set(heapSize, al.get(0));
                al.set(0, temp);
                heapSize--;
                satisfyHeap(al, 0, heapSize);
            }

            StringBuilder sb = new StringBuilder();
            for (Iterator<Node> i = al.listIterator(); i.hasNext(); ) {
                temp = i.next();
                for (int j=0; j<temp.value; j++) {
                    sb.append(temp.key);
                }
            }
            return sb.toString();
        }
    }
}*/

