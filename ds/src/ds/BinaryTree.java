package ds;

import java.util.Stack;

public class BinaryTree {
    private BinaryNode root;
    private int size;
    private int levels;

    public BinaryTree() {
        root = null;
        size = 0;
        levels = 0;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int n) {
        if (root == null) {
            root = new BinaryNode(n);
        }

        BinaryNode parent = null;
        BinaryNode temp = root;
        int l = 0;
        while (temp != null) {
            parent = temp;
            if (n < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
            l++;
        }

        BinaryNode node = new BinaryNode(n);
        if (n < parent.value) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        l++;

        size++;
        
        if (l > levels) {
            levels = l;
        }

    }

    public void delete(int value) {

    }

    public int getSize() {
        return size;
    }

    public int getLevels() {
        return levels;
    }

    public void displayBreadthFirst() {

    }

    public void displayDepthFirst() {

    }

}
