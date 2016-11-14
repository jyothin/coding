package ds;

import java.util.Stack;
import java.util.LinkedList;

public class BinaryTree {
    BinaryNode root;
    private int size;
    private int levels;

    public BinaryTree() {
        root = null;
        size = 0;
        levels = 0;
    }

    public void insert(int n) {
        if (root == null) {
            root = new BinaryNode(n);
            root.level = 0;
            return;
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
        node.level = parent.level+1;
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
        BinaryNode parent = null;
        BinaryNode temp = root;

        while (temp != null) {
            if (value == temp.value) {
                break;
            }
            if (value < temp.value) {
                parent = temp;
                temp = temp.left;
            } else {
                parent = temp;
                temp = temp.right;
            }
            System.out.println(parent.value+" "+temp.value);
        }

        if (temp.value < parent.value) {
            parent.left = null;
        } else {
            parent.right = null;
        }

        LinkedList<BinaryNode> queue = new LinkedList<BinaryNode>();
        BinaryNode ttemp;
        BinaryNode left = temp.left;
        queue.add(left);
        while (queue.peek() != null) {
            ttemp = queue.remove();
            insert(ttemp.value);
            if (ttemp.left != null) {
                queue.add(ttemp.left);
            }
            if (ttemp.right != null) {
                queue.add(ttemp.right);
            }
        }
        BinaryNode right = temp.right;
        queue.add(right);
        while (queue.peek() != null) {
            ttemp = queue.remove();
            insert(ttemp.value);
            if (ttemp.left != null) {
                queue.add(ttemp.left);
            }
            if (ttemp.right != null) {
                queue.add(ttemp.right);
            }
        }
    }

    public BinaryNode find(int value) {
        BinaryNode temp = root;
        while (value != temp.value) {
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if (temp != null) {
            return temp;
        } else {
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public int getLevels() {
        return levels;
    }

    public void displayBreadthFirst() {
        LinkedList<BinaryNode> queue = new LinkedList<BinaryNode>();
        BinaryNode temp;
        queue.add(root);
        while (queue.peek() != null) {
            temp = queue.remove();
            System.out.println(temp.level+": "+temp.value);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public void displayReverseBreadthFirst() {
        LinkedList<BinaryNode> stack = new LinkedList<BinaryNode>();
        BinaryNode temp;
        stack.push(root);
        while (stack.peek() != null) {
            temp = stack.pop();
            System.out.println(temp.level+": "+temp.value);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
    }

    public void displayDepthFirst() {
        postOrderTraverse(root);
        System.out.println();
    }

    public void inOrderTraverse(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.print(node.level+": "+node.value+", ");
        inOrderTraverse(node.right);
    }

    public void preOrderTraverse(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.level+": "+node.value+", ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void postOrderTraverse(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.level+": "+node.value+", ");
    }

}
