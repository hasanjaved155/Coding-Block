package assignment_13_Binary_Tree;

import java.util.Scanner;

class Node{
    Node left , right;
    int val;
}
public class Sibling {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = buildTree();

        sibling(root);
    }

    private static void sibling(Node root) {
        if (root == null)return;

        if (root.left != null && root.right == null){
            System.out.print(root.left.val + " ");
        }
        if (root.right != null && root.left == null){
            System.out.print(root.right.val + " ");
        }

        sibling(root.left);
        sibling(root.right);
    }

    private static Node buildTree() {
        Node root = new Node();
        root.val = scanner.nextInt();

        boolean left = scanner.nextBoolean();
        if (left)root.left = buildTree();

        boolean right = scanner.nextBoolean();
        if (right)root.right = buildTree();

        return root;
    }
}
