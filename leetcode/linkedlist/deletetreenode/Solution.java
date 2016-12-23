package deletetreenode;

import java.util.LinkedList;

public class Solution {
    public void deleteNode(ListNode node) {
    	if (node.next == null) {
    		return;
    	}
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) { return null; }
        if (head.next  == null) { return head; }
        LinkedList<ListNode> stack = new LinkedList<ListNode>();
        ListNode temp = head;
        while (temp != null) {
        	stack.add(temp);
        	temp = temp.next;
        }
        
        ListNode newHead = null;
        while (stack.peek() != null) {
        	ListNode node = new ListNode(stack.remove().val);
        	node.next = newHead;
        	newHead = node;
        }
        return newHead;
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
    	public ListNode(int x) { 
    		val = x;
    		next = null;
    	}
    }
}
