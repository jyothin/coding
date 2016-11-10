package bubbleSort;

public class BubbleSort {
	
	public BubbleSort() {
	}
	
    public void swapWithPrev(Node head, Node n) {
        Node temp = head;
        Node prev, cur, next;
        while (temp.next != null) {
            if (temp.next.value == n.value) {
                break;
            }
        }

        prev = temp;
        cur = temp.next;
        next = temp.next.next;

        prev.next = next;
        cur.next = next.next.next;
        next.next = cur;
    }

	public Node sort(Node head) {
		if (head == null) {
			return head;
		}
		
		if (head.next == null) {
			return head;
		}
		
		Node temp, prev, cur;
		temp = head;
		while (temp != null) {
            cur = temp;
            SinglyLinkedList.display(head);
			//while (cur.next != null) {
            for (int i=0; i<2; i++) {
				if (cur.value > cur.next.value) {
                    swapWithPrev(head, cur);
				} else {
                    cur = cur.next;
                }
                SinglyLinkedList.display(head);
			}
            temp = temp.next;
		}
		
		return head;
	}

}
