package mergesort;

import mylinkedlist.Node;

public class Main {

	public static void main(String[] args) {
		Node head1 = new Node(0);
		Node tail1 = head1;
		Node l;
		for (int i=0; i<10; i++) {
			l = new Node(i);
			tail1.next = l;
			tail1 = tail1.next;
		}
		l = new Node(4);
		tail1.next = l;
		tail1 = tail1.next;
		
		
		tail1 = head1.next;
		while (tail1 != null) {
			System.out.print(tail1.data+" ");
			tail1 = tail1.next;
		}
		System.out.print("\n");
		
		Node head2 = new Node(0);
		Node tail2 = head2;
		for (int i=5; i>-5; i--) {
			l = new Node(i);
			tail2.next = l;
			tail2 = tail2.next;
		}
		l = new Node(-3);
		tail2.next = l;
		tail2 = tail2.next;
		
		tail2 = head2.next;
		while (tail2 != null) {
			System.out.print(tail2.data+" ");
			tail2 = tail2.next;
		}
		System.out.print("\n");

		MergeSort m = new MergeSort();
		
		head1 = m.mergeSort(head1.next);
		tail1 = head1;
		while (tail1 != null) {
			System.out.print(tail1.data+" ");
			tail1 = tail1.next;
		}
		System.out.print("\n");
		
		head2 = m.mergeSort(head2.next);
		tail2 = head2;
		while (tail2 != null) {
			System.out.print(tail2.data+" ");
			tail2 = tail2.next;
		}
		System.out.print("\n");
		
		Node ohead = m.mergeSorted(head1, head2);
		while (ohead!=null) {
			System.out.print(ohead.data+" ");
			ohead = ohead.next;
		}
	
	}

}
