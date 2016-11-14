package binarytree;

import java.util.ArrayList;

import myarraylist.MyArrayList;

public class Main {

	public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add("c".charAt(0), 100);
        bt.add("c".charAt(0), 10);
        bt.add("c".charAt(0), 1);
        bt.add("c".charAt(0), 5);
        bt.add("c".charAt(0), 200);
        bt.add("c".charAt(0), -1);
        System.out.println("size: "+bt.getSize()+", level: "+bt.getLevels());
        
        bt.preOrderTraverse(bt.root);
        System.out.println();
        
        bt.inOrderTraverse(bt.root);
        System.out.println();

        bt.postOrderTraverse(bt.root);
        System.out.println();
        
        bt.displayBreadthFirst();
        bt.displayReverseBreadthFirst();
        bt.displayDepthFirst();
    	
        bt.remove(1);
        System.out.println("size: "+bt.getSize()+", level: "+bt.getLevels());
        bt.displayBreadthFirst();
        
        ArrayList<BinaryNodeKey> al = bt.heapSort();
        String output = MyArrayList.displayBinaryNodeKey(al);
        System.out.println(output);
        
        bt.displayBreadthFirst();
        
        bt.add("c".charAt(0), -2);
        bt.add("c".charAt(0), -3);
        bt.add("c".charAt(0), -4);

        bt.displayBreadthFirst();
        
        boolean balanced = bt.isBalanced(bt.root);
        System.out.println(Boolean.toString(balanced));
        
        BinaryTree newBt = bt.balanceTree();
        System.out.println(Boolean.toString(newBt.isBalanced(newBt.root)));
        
        newBt.displayBreadthFirst();
        
	}

}
