package ds;

public class Node {
    int value;
    Node next;

    public Node (int v) {
        value = v;
        next = null;
    }
    
    public void display() {
    	System.out.print(value+" ");
    }

}

