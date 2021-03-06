package mergetwolists;

import mergetwolists.Solution;
import mergetwolists.Solution.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		ListNode head1 = null;
		for (int i=0; i<10; i++) {
			ListNode node = solution.new ListNode(i);
			node.val = i;
			node.next = head1;
			head1 = node;
		}
		
		MergeSort mergeSort = new MergeSort();
		head1 = mergeSort.mergeSort(head1);
		
		ListNode temp;
		
		temp = head1;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		ListNode head2 = null;
		for (int i=-5; i<5; i++) {
			ListNode node = solution.new ListNode(i);
			node.val = i;
			node.next = head2;
			head2 = node;
		}
		
		head2 = mergeSort.mergeSort(head2);
		
		temp = head2;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		ListNode head = solution.mergeTwoLists(head1, head2);

		temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
	}


}
