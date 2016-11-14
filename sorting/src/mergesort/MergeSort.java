package mergesort;

import mylinkedlist.Node;

public class MergeSort {
	
	public MergeSort() {
		
	}
	
	public Node merge(Node left, Node right) {
		Node temp = new Node(0);
		Node head = temp;
		
		while (left != null && right != null) {
			if (left.data < right.data) {
				head.next = left;
				head = left;
				left = left.next;
			} else {
				head.next = right;
				head = right;
				right = right.next;
			}
		}
		
		if (left == null) {
			head.next = right;
		}
		if (right == null) {
			head.next = left;
		}
		
		return temp.next;
		
	}
	
	public Node mergeSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		Node l = head;
		Node r = head.next;
		
		while (r != null && r.next != null) {
			head = head.next;
			r = (r.next).next;
		}
		
		r = head.next;
		head.next = null;
		
		l = mergeSort(l);
		r = mergeSort(r);
		
		return merge(l, r);
		
	}
	
	public Node mergeSorted(Node head1, Node head2) {

		if (head1 == null && head2 == null) {
			return null;
		}
		
		if (head1 == null) {
			return head2;
		} else if (head2 == null) {
			return head1;
		}
		
		Node head = new Node(0);
		Node tail = head;
		
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				tail.next = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
		}
		if (head1 == null) {
			tail.next = head2;
		} else {
			tail.next = head1;
		}
		
		return head.next;
	}

}
