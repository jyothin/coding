package ds;

public class BinaryTreeSolution {
    
    public static void main(String args[]) {

        BinaryTree bt = new BinaryTree();
        bt.insert(100);
        bt.insert(10);
        bt.insert(1);
        bt.insert(5);
        bt.insert(200);
        bt.insert(-1);
        System.out.println(bt.getSize()+", "+bt.getLevels());
        bt.inOrderTraverse(bt.root);
        System.out.println();
        bt.preOrderTraverse(bt.root);
        System.out.println();
        bt.postOrderTraverse(bt.root);
        System.out.println();
        System.out.println(bt.getSize()+", "+bt.getLevels());
        bt.displayBreadthFirst();
        bt.displayReverseBreadthFirst();
        bt.displayDepthFirst();

        bt.delete(1);
        System.out.println(bt.getSize()+", "+bt.getLevels());
        bt.displayBreadthFirst();
    }

}
