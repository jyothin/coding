package ksmallestpairs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    	
    	int sum = 0;
    	ArrayList<Node> al = new ArrayList<Node>();
    	for (int i=0; i<nums1.length; i++) {
    		for (int j=0; j<nums2.length; j++) {
    			sum = nums1[i] + nums2[j];
    			Node node = new Node(sum, nums1[i], nums2[j]);
    			al.add(node);
    		}
    	}
    	al = sortBySum(al);
    	ArrayList<int[]> oAl = new ArrayList<int[]>();
    	for (int i=0; i<al.size() || i<k; i++) {
    		Node node = al.get(i);
    		int[] o = new int[] {node.num1, node.num2};
    		oAl.add(o);
    	}

    	return oAl;
        
    }

    public void satisfyHeap(ArrayList<Node> al, int root, int heapSize) {
    	int left = 2*root;
    	int right = 2*root + 1;
    	int largest = root;
    	if (left <= heapSize && al.get(left).sum > al.get(largest).sum) {
    		largest = left;
    	}
    	if (right <= heapSize && al.get(right).sum > al.get(largest).sum) {
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
    	int heapSize = size - 1;
    	for (int i=size/2; i>-1; i--) {
    		satisfyHeap(al, i, heapSize);
    	}
    }
    
    public ArrayList<Node> sortBySum(ArrayList<Node> al) {
    	buildHeap(al, al.size());
    	int heapSize = al.size() - 1;
    	Node temp;
    	for (int i=heapSize; i>-1; i--) {
    		temp = al.get(heapSize);
    		al.set(heapSize, al.get(0));
    		al.set(0,  temp);
    		heapSize--;
    		satisfyHeap(al, 0, heapSize);
    	}
    	
    	return al;
    }
    
    public class Node {
        int sum;
        int num1;
        int num2;
        Node left;
        Node right;
        
        public Node(int s, int n1, int n2) {
        	sum = s;
        	num1 = n1;
        	num2 = n2;
        }
    }
    
}
