package hascycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
    	if (head == null) { return false; }
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
        	walker = walker.next;
        	runner = runner.next.next;
        	if (walker == runner) {
        		return true;
        	}
        }
    	return false;
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
    	
    	public ListNode(int v) {
    		val = v;
    		next = null;
    	}
    }
}
