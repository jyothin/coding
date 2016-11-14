package binarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.w3c.dom.Node;

import myarraylist.MyArrayList;

public class BinaryTree {
	BinaryNodeKey root;
	private int size;
	private int levels;
	
	public BinaryTree() {
		root = null;
		size = 0;
		levels = 0;
	}
	
	public void add(char k, int v) {
		if (root == null) {
			root = new BinaryNodeKey(k, v);
			size++;
			root.level = 0;
			return;
		}
		BinaryNodeKey parent = null;
		BinaryNodeKey temp = root;
		int l=0;
		while (temp != null) {
			parent = temp;
			if (v < temp.data) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
			l++;
		}
		
		BinaryNodeKey node = new BinaryNodeKey(k, v);
		node.level = parent.level+1;
		if (v < parent.data) {
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
	
    public BinaryNodeKey find(int value) {
        BinaryNodeKey temp = root;
        while (value != temp.data) {
            if (value < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }
    
    public void remove(int value) {
    	//System.out.println("value="+value);
        BinaryNodeKey parent = null;
        BinaryNodeKey temp = root;

        while (temp != null) {
            if (value == temp.data) {
                break;
            }
            if (value < temp.data) {
                parent = temp;
                temp = temp.left;
            } else {
                parent = temp;
                temp = temp.right;
            }
            //System.out.println(parent.data+"->"+temp.data);
        }
        //System.out.println("->"+temp.data);
        
        if (parent != null) {
        	if (temp.data < parent.data) {
            	parent.left = null;
        	} else {
        		parent.right = null;
        	}
    	} else {
    		root = null;
    	}

        size--;
        
        size = size - sizeOf(temp.left);
        size = size - sizeOf(temp.right);
        
        LinkedList<BinaryNodeKey> queue = new LinkedList<BinaryNodeKey>();
        BinaryNodeKey ttemp;
        BinaryNodeKey left = temp.left;
        queue.add(left);
        while (queue.peek() != null) {
            ttemp = queue.remove();
            add(ttemp.key, ttemp.data);
            if (ttemp.left != null) {
                queue.add(ttemp.left);
            }
            if (ttemp.right != null) {
                queue.add(ttemp.right);
            }
        }
        BinaryNodeKey right = temp.right;
        queue.add(right);
        while (queue.peek() != null) {
            ttemp = queue.remove();
            add(ttemp.key, ttemp.data);
            if (ttemp.left != null) {
                queue.add(ttemp.left);
            }
            if (ttemp.right != null) {
                queue.add(ttemp.right);
            }
        }
    }

    public int getSize() {
        return size;
    }
    
    public int sizeOf(BinaryNodeKey root) {
    	if (root == null) {
    		return 0;
    	} else {
    		return sizeOf(root.left)+1+sizeOf(root.right)+1;
    	}
    }

    public int getLevels() {
        return levels;
    }
    
    /* breadth and depth first traversal methods */
    public void displayBreadthFirst() {
        LinkedList<BinaryNodeKey> queue = new LinkedList<BinaryNodeKey>();
        BinaryNodeKey temp;
        queue.add(root);
        while (queue.peek() != null) {
            temp = queue.remove();
            System.out.println(temp.level+": ("+temp.key+","+temp.data+"), ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }
    
    public void displayReverseBreadthFirst() {
        LinkedList<BinaryNodeKey> stack = new LinkedList<BinaryNodeKey>();
        BinaryNodeKey temp;
        stack.push(root);
        while (stack.peek() != null) {
            temp = stack.pop();
            System.out.println(temp.level+": ("+temp.key+", "+temp.data+"), ");
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
    
    /* Traversal methods */
    public void inOrderTraverse(BinaryNodeKey node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.print(node.level+": ("+node.key+", "+node.data+"), ");
        inOrderTraverse(node.right);
    }
    
    public void preOrderTraverse(BinaryNodeKey node) {
        if (node == null) {
            return;
        }
        System.out.print(node.level+": ("+node.key+", "+node.data+"), ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void postOrderTraverse(BinaryNodeKey node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.level+": ("+node.key+", "+node.data+"), ");
    }
    
    /* Heap Sort */
    
    public ArrayList<BinaryNodeKey> buildArrayList() {
    	ArrayList<BinaryNodeKey> al = new ArrayList<BinaryNodeKey>();
    	LinkedList<BinaryNodeKey> queue = new LinkedList<BinaryNodeKey>();
    	queue.add(root);
    	BinaryNodeKey temp = root;
    	while (queue.peek() != null) {
    		temp = queue.remove();
    		al.add(temp);
    		if (temp.left != null) {
    			queue.add(temp.left);
    		}
    		if (temp.right != null) {
    			queue.add(temp.right);
    		}
    	}
    	System.out.println("size: "+al.size());
    	return al;
    }
    
    public void buildBinaryTreeFromArrayList(ArrayList<BinaryNodeKey> al) {
    	for (int i=0; i<al.size(); i++) {
    		remove(al.get(i).data);
    	}
    	//displayBreadthFirst();

    	BinaryNodeKey temp;
    	for (Iterator<BinaryNodeKey> i = al.listIterator(); i.hasNext(); ) {
    		temp = i.next();
    		add(temp.key, temp.data);
    	}
    	
    }
    
    private void satisfyHeap(ArrayList<BinaryNodeKey> al, int root, int heapSize) {
    	int left = 2*root;
    	int right = 2*root+1;
    	int largest = root;
    	if (left <= heapSize && al.get(left).data < al.get(largest).data) {
    		largest = left;
    	}
    	if (right <= heapSize && al.get(right).data < al.get(largest).data) {
    		largest = right;
    	}
    	BinaryNodeKey temp;
    	if (largest != root) {
    		temp = al.get(root);
    		al.set(root, al.get(largest));
    		al.set(largest, temp);
    		satisfyHeap(al, largest, heapSize);
    	}
    }
    private void buildHeap(ArrayList<BinaryNodeKey> al, int size) {
    	int heapSize = size-1;
    	for (int i=size/2; i>-1; i--) {
    		satisfyHeap(al, i, heapSize);
    	}
    	return;
    }
    
    public ArrayList<BinaryNodeKey> heapSort() {
    	ArrayList<BinaryNodeKey> al = buildArrayList();
    	buildHeap(al, al.size());
    	int heapSize = al.size()-1;
    	BinaryNodeKey temp = root;
    	for (int i=heapSize; i>-1; i--) {
    		temp = al.get(heapSize);
    		al.set(heapSize, al.get(0));
    		al.set(0, temp);
    		heapSize--;
    		satisfyHeap(al, 0, heapSize);
    	}
    	System.out.println(MyArrayList.displayBinaryNodeKey(al));
    	
    	buildBinaryTreeFromArrayList(al);
    	
    	return al;
    	
    }

    /* Balance a binary tree */
    public int height(BinaryNodeKey node) {
    	if (node == null) {
    		return 0;
    	}
    	return Math.max( height(node.left)+1, height(node.right)+1 );
    }
    
    public boolean isBalanced(BinaryNodeKey root) {
    	if (root == null) {
    		return true;
    	}
    	
    	int lh;
    	int rh;
    	lh = height(root.left);
    	rh = height(root.right);
    	
    	if ( Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public BinaryTree balanceTree() {
    	ArrayList<BinaryNodeKey> al = buildArrayList();
    	al = heapSort();
    	BinaryTree newBt = new BinaryTree();
    	balance(newBt, al, 0, al.size()-1);
    	return newBt;
    }
    
    public void balance(BinaryTree newBt, ArrayList<BinaryNodeKey> al, int left, int right) {
    	
    	if (left == right) {
    		return;
    	}
    	
    	int middle = (left + right) / 2;
    	System.out.println(left+", "+middle+", "+right);
    	
    	newBt.add(al.get(middle).key, al.get(middle).data);
    	
    	balance(newBt, al, left, middle);
    	balance(newBt, al, middle+1, right);
    	
    }

}
