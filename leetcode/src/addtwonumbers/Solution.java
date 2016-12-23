package addtwonumbers;

import java.util.LinkedList;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	displayList(l1);
    	ListNode list1 = reverseList(l1);
    	displayList(list1);
    	displayList(l2);
    	ListNode list2 = reverseList(l2);
    	displayList(list2);
    	
    	int carry = 0;
    	int sum;
    	
    	ListNode ohead = new ListNode(-1);
    	ListNode olist = ohead;
    	
    	
    	while (list1 != null && list2 != null) {
    		sum = carry + list1.val + list2.val;
    		if (sum > 9) { carry = 1; }
    		else { carry = 0; }
    		//System.out.print(sum+":"+carry+" ");
    		olist.next = new ListNode(sum % 10);
    		olist = olist.next;
    		list1 = list1.next;
    		list2 = list2.next;
    	}
    	
    	ListNode list;
    	if (list1 != null) { list = list1; }
    	else { list = list2; }
    	
    	while (list != null) {
    		sum = carry + list.val;
    		if (sum > 9) { carry = 1; }
    		else { carry = 0; }
    		olist.next = new ListNode(sum % 10);
    		olist = olist.next;
    		list = list.next;
    	}
    	
    	if (carry == 1) { olist.next = new ListNode(carry); olist = olist.next; }
    	
    	ListNode orhead = reverseList(ohead.next);
    	
    	return orhead;
    }
    
    public ListNode reverseList(ListNode list) {
    	LinkedList<ListNode> stack = new LinkedList<ListNode>();
    	while (list != null) {
    		stack.add(list);
    		list = list.next;
    	}
    	ListNode head = new ListNode(-1);
    	ListNode node = head;
    	while (stack.peek() != null) {
    		node.next = stack.removeLast();
    		node = node.next;
    	}
    	node.next = null;
    	return head.next;
    }
    
    public void displayList(ListNode list) {
		while (list != null) {
			System.out.print(list.val+", ");
			list = list.next;
		}
		System.out.println();
    }
    
    public class ListNode {
    	 int val;
    	 ListNode next;
    	 ListNode(int x) { val = x; }
    }
    
}
