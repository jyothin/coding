package mylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LLinkedList {
	
	public static String display(LinkedList<Node> ll) {
		StringBuilder sb = new StringBuilder();
		
		Iterator<Node> i = ll.listIterator();
		Node node;
		while(i.hasNext()) {
			node = i.next();
			sb.append(node.data);
			sb.append(", ");
		}
		
		return sb.toString();
	}
	
	public static int displaySize(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static String display(Node head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.data);
			sb.append(", ");
			head = head.next;
		}
		return sb.toString();
	}

}
