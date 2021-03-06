package p138_copyrandomlist;

import p138_copyrandomlist.Solution.RandomListNode;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		RandomListNode head, node, newHead;
		
		node = s.new RandomListNode(10);
		head = s.add(null, node);
		node = s.new RandomListNode(100);
		head = s.add(head, node);
		
		newHead = s.copyRandomList(head);
		
		int count = 0;
		while (newHead != null) {
			count++;
			newHead = newHead.next;
		}
		System.out.println(count);
		
	}

}
