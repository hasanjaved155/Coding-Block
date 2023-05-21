package assignment_13_Binary_Tree;

import java.util.*;

public class ArrayList_Level_Order_Binary_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
    }
    static Node root;
    static Scanner scanner =new Scanner(System.in);
    static HashMap<Integer, LinkedList<Integer>> l = new HashMap<>();
    static LinkedList<LinkedList<Integer>> l2 = new LinkedList<>();
    static int levelMax = 0;

    public static void main(String[] args) {
        root = createTree();
        printPreOrder(root,1);
        for (int i = 1; i <= l.size(); i++) {
            l2.add(l.get(i));
        }
        System.out.println(l2);
    }

    private static void printPreOrder(Node node, int level) {
        if (node==null){
            return;
        }

        LinkedList<Integer> list = l.get(level);
        if(list==null){
            list = new LinkedList<>();
        }
        list.add(node.data);
        l.put(level,list);
        if(level>levelMax){
            levelMax = level;
        }
        printPreOrder(node.left,level+1);
        printPreOrder(node.right,level+1);
    }

    private static Node createTree() {
        int item = scanner.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = scanner.nextBoolean();
        if (hlc){
            nn.left = createTree();
        }
        boolean hrc = scanner.nextBoolean();
        if (hrc){
            nn.right = createTree();
        }
        return nn;
    }
}
