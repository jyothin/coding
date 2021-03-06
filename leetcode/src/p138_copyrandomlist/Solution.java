package p138_copyrandomlist;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	RandomListNode newHead = null;
    	RandomListNode newTail = null;
    	RandomListNode current;
    	RandomListNode newCurrent;
    	
    	current = head;
    	
    	while (current != null) {
    		RandomListNode node = new RandomListNode(current.label);
    		if (newTail == null) {
    			newTail = node;
    			newHead = newTail;
    		} else {
    			newTail.next = node;
    			newTail = node;
    		}
    		current = current.next;
    	}
    	
    	current = head;
    	newCurrent = newHead;
    	
    	while (current != null) {
    		if (current.random != null) {
    			RandomListNode node = findNode(newHead, current.random.label);
        		newCurrent.random = node;
    		}
    		current = current.next;
    		newCurrent = newCurrent.next;
    	}
    	
    	return newHead;
        
    }
    
    public RandomListNode findNode(RandomListNode head, int label) {
    	RandomListNode current = head;
    	while (current != null) {
    		if (current.label == label) {
    			return current;
    		}
    		current = current.next;
    	}
    	return null;
    }
    
    public class RandomListNode {
    	int label;
    	RandomListNode next, random;
    	RandomListNode(int x) { this.label = x; }
    }
    
    public RandomListNode add(RandomListNode head, RandomListNode node) {
    	RandomListNode current;

    	if (head == null) {
    		head = node;
    		return head;
    	}
    	
    	current = head;
    	while (current.next != null) {
    		current = current.next;
    	}
    	current.next = node;
    	return head;
    }
    
    public RandomListNode copyRandomList2(RandomListNode head) {
    	RandomListNode iter = head, next;

    	// First round: make copy of each node,
    	// and link them together side-by-side in a single list.
    	while (iter != null) {
    		next = iter.next;

    		RandomListNode copy = new RandomListNode(iter.label);
    		iter.next = copy;
    		copy.next = next;

    		iter = next;
    	}

    	// Second round: assign random pointers for the copy nodes.
    	iter = head;
    	while (iter != null) {
    		if (iter.random != null) {
    			iter.next.random = iter.random.next;
    		}
    		iter = iter.next.next;
    	}

    	// Third round: restore the original list, and extract the copy list.
    	iter = head;
    	RandomListNode pseudoHead = new RandomListNode(0);
    	RandomListNode copy, copyIter = pseudoHead;

    	while (iter != null) {
    		next = iter.next.next;

    		// extract the copy
    		copy = iter.next;
    		copyIter.next = copy;
    		copyIter = copy;

    		// restore the original list
    		iter.next = next;

    		iter = next;
    	}

    	return pseudoHead.next;
    }
}
