package swappairs;

import swappairs.Solution;
import swappairs.Solution.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		ListNode head = null;
		for (int i=-4; i<6; i++) {
			ListNode node = solution.new ListNode(i);
			node.val = i;
			node.next = head;
			head = node;
		}
		
		ListNode temp;
		
		temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		head = solution.swapPairs(head);
		
		temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();

	}

}
