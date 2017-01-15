package p160_getintersectionnode;

import p160_getintersectionnode.Solution.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		ListNode node1;
		node1 = s.new ListNode(10);
		node1.next = s.new ListNode(9);
		node1.next.next = s.new ListNode(8);
		node1.next.next.next = s.new ListNode(7);
		node1.next.next.next.next = s.new ListNode(6);
		node1.next.next.next.next.next = s.new ListNode(5);
		node1.next.next.next.next.next.next = s.new ListNode(4);
		node1.next.next.next.next.next.next.next = s.new ListNode(3);
		node1.next.next.next.next.next.next.next.next = s.new ListNode(2);
		node1.next.next.next.next.next.next.next.next.next = s.new ListNode(1);
		
		ListNode node2;
		node2 = s.new ListNode(5);
		node2.next = s.new ListNode(4);
		node2.next.next = s.new ListNode(3);
		node2.next.next.next = s.new ListNode(2);
		node2.next.next.next.next = s.new ListNode(1);
		
		ListNode node3;
		node3 = s.getIntersectionNode(node1, node2);
		while (node3 != null) {
			System.out.print(node3.val);
			node3 = node3.next;
		}
		
	}

}
