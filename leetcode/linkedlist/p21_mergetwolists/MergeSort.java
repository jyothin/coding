package mergetwolists;

import mergetwolists.Solution.ListNode;

public class MergeSort {
	
	public ListNode merge(ListNode l, ListNode r) {
		Solution solution = new Solution();
		ListNode head = solution.new ListNode(0);
		ListNode temp = head;
		
		while (l != null && r != null) {
			if (l.val < r.val) {
				temp.next = l;
				l = l.next;
			} else {
				temp.next = r;
				r = r.next;
			}
			temp = temp.next;
		}
		if (r == null) {
			temp.next = l;
		}
		if (l == null) {
			temp.next = r;
		}
		return head.next;
	}
	
	public ListNode mergeSort(ListNode head) {
		if (head == null) { return null; }
		if (head.next == null) { return head; }
		
		ListNode l = head;
		ListNode r = head.next;
		
		while (r != null && r.next != null) {
			head = head.next;
			r = r.next.next;
		}
		
		r = head.next;
		head.next = null;
		
		// merge individual lists
		l = mergeSort(l);
		r = mergeSort(r);
		
		return merge(l, r);
		
	}
}
