package assignment_13_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree_Print_All_Leaf_Nodes {
    static class Node{
        int val;
        Node left,right;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = buildTree();
        printLeafNode(root);
    }

    private static void printLeafNode(Node root) {
        if (root == null)return;

        if (root.left == null && root.right == null){
            System.out.print(root.val + " ");
        }
        printLeafNode(root.left);
        printLeafNode(root.right);
    }

    private static Node buildTree() {
        Node node = new Node();
        node.val = scanner.nextInt();
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Node listnode = q.remove();
            int x = scanner.nextInt();
            if (x != -1){
                Node leftNode = new Node();
                leftNode.val = x;
                listnode.left = leftNode;
                q.add(leftNode);
            }
            int y = scanner.nextInt();
            if (y != -1){
                Node rightNode = new Node();
                rightNode.val = y;
                listnode.right = rightNode;
                q.add(rightNode);
            }
        }
        return node;
    }
}
