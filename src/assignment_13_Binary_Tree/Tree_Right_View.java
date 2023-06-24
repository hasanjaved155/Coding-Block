package assignment_13_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree_Right_View {
    static class Node{
        Node left, right;
        int val;
    }
    static Scanner scanner = new Scanner(System.in);
    static int max = -1;

    public static void main(String[] args) {
        Node root = buildTree();
        LinkedList<Integer>list = new LinkedList<>();
        rightView(root,list,0);
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }

    private static void rightView(Node root, LinkedList<Integer> list,int curr) {
        if (root == null)return;

        if (max < curr){
            list.add(root.val);
            max = curr;
        }
        rightView(root.right,list,curr + 1);
        rightView(root.left,list,curr + 1);
    }

    private static Node buildTree() {
        Node node = new Node();
        node.val = scanner.nextInt();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Node root = q.remove();
            int x = scanner.nextInt();
            if (x != -1){
                Node leftNode = new Node();
                leftNode.val = x;
                root.left = leftNode;
                q.add(leftNode);
            }
            int y = scanner.nextInt();
            if (y != -1){
                Node rightNode = new Node();
                rightNode.val = y;
                root.right = rightNode;
                q.add(rightNode);
            }
        }
        return node;
    }
}
