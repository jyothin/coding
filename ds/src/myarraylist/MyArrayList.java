package myarraylist;

import java.util.ArrayList;

import binarytree.BinaryNodeKey;
import models.Data;

public class MyArrayList {
	
	public static void swap(ArrayList<Data> al, int n1, int n2) {
    	Data temp = al.get(n1);
    	al.set(n1, al.get(n2));
    	al.set(n2, temp);
    }
    
    public static String display(ArrayList<Data> al) {
    	int size = al.size();
    	int i = 0;
    	StringBuilder sb = new StringBuilder();
    	while (i < size) {
    		sb.append(al.get(i).data);
    		sb.append(", ");
    		i++;
    	}
    	return sb.toString();
    }
    
    public static String displayBinaryNodeKey(ArrayList<BinaryNodeKey> al) {
    	int size = al.size();
    	int i = 0;
    	StringBuilder sb = new StringBuilder();
    	BinaryNodeKey node;
    	while (i < size) {
    		node = al.get(i);
    		sb.append(node.data);
    		sb.append(": ");
    		for (int j=0; j<node.data; j++) {
    			sb.append(node.key);
    		}
    		sb.append(", ");
    		i++;
    	}
    	return sb.toString();
    }

}
