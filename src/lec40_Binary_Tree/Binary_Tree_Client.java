package lec40_Binary_Tree;

public class Binary_Tree_Client {
    public static void main(String[] args) {
        Binary_Tree bt = new Binary_Tree();
        //5 true 7 true 3 false false false true 8 false true 6 false false
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.search(90));
        System.out.println(bt.height());
        bt.preOrder();
        bt.inOrder();
        bt.postOrder();
        bt.levelOrder();
    }
}
