package mergeSort;

public class MergeSort {
	
	public Node merge(Node left, Node right) {
		Node temp = new Node(0);
		Node head = temp;
		
		while (left != null && right != null) {
			if (left.value < right.value) {
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
	
	public Node mergeSorted(Node l1, Node l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		
		Node head = new Node(0);
		Node tail = head;
		
		while (l1 != null && l2 != null) {
			if (l1.value < l2.value) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		if (l1 == null) {
			tail.next = l2;
		} else {
			tail.next = l1;
		}
		
		return head.next;
	}

}
