package ds;

public class BinaryTreeSolution {
    
    public static void main(String args[]) {

        BinaryTree bt = new BinaryTree();
        bt.insert(100);
        bt.insert(10);
        bt.insert(1);
        bt.insert(200);
        System.out.println(bt.getSize()+" "+bt.getLevels());
    }

}
