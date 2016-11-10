package bubbleSort;

public class Solution {

	public static void main(String[] args) {
		Node node;
		SinglyLinkedList sll = new SinglyLinkedList();
		
		node = new Node(10);
		sll.insertTail(node);
		node = new Node(-1);
		sll.insertTail(node);
		node = new Node(20);
		sll.insertHead(node);
		node = new Node(110);
		sll.insertHead(node);		
		
		System.out.print(sll.getSize()+"\n");
		sll.display();
		
		Node head = sll.getHead();
		BubbleSort bs = new BubbleSort();
		head = bs.sort(head);
		
		sll.display();
		
	}

}
