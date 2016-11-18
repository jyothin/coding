package deletenode;

import deletenode.Solution.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		// create the list
		ListNode head = null;
		ListNode n = null;
		ListNode temp = null;
		for (int i=0; i<10; i++) {
			ListNode node = solution.new ListNode(i);
			node.val = i;
			node.next = head;
			head = node;
			if (i == 4) {
				n = head;
			}
		}
		
		temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		solution.deleteNode(n);
		
		temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		ListNode newHead = solution.reverseList(head);

		temp = newHead;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();

	}

}
