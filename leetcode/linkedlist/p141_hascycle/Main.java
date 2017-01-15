package hascycle;

import hascycle.Solution.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode head = null;
		ListNode n = null;
		ListNode temp = null;
		ListNode tail = null;
		for (int i=0; i<10; i++) {
			ListNode node = solution.new ListNode(i);
			node.val = i;
			node.next = head;
			head = node;
			if (i == 4) {
				n = head;
			}
			if (head.next == null) {
				tail = head;
			}
		}
		//tail.next = n;
		
		/*temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();*/
		
		System.out.println(solution.hasCycle(head));

	}

}
