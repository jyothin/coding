package addtwonumbers;

import addtwonumbers.Solution.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		ListNode l1;
		l1 = s.new ListNode(1);
		l1.next = s.new ListNode(9);
		l1.next.next = s.new ListNode(9);
		l1.next.next.next = s.new ListNode(9);
		ListNode h1 = l1;
		/*while (l1 != null) {
			System.out.print(l1.val+", ");
			l1 = l1.next;
		}
		System.out.println();*/

		ListNode l2;
		l2 = s.new ListNode(1);
		l2.next = s.new ListNode(2);
		l2.next.next = s.new ListNode(3);
		ListNode h2 = l2;
		/*while (l2 != null) {
			System.out.print(l2.val+", ");
			l2 = l2.next;
		}
		System.out.println();*/

		ListNode ol = s.addTwoNumbers(h1, h2);
		while (ol != null) {
			System.out.print(ol.val+", ");
			ol = ol.next;
		}

	}

}
