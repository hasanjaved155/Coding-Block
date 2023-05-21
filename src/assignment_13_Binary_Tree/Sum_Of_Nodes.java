package assignment_13_Binary_Tree;

import java.util.Scanner;

public class Sum_Of_Nodes {
    static class Node{
        int val;
        Node left,right;
    }
    static Scanner scanner = new Scanner(System.in);
    static int sum = 0;
    public static void main(String[] args) {
        Node root = buildTree();
        nodeSum(root);
        System.out.println(sum);
    }

    private static void nodeSum(Node root) {
        if (root == null){
            return;
        }
        sum = sum + root.val;
        nodeSum(root.left);
        nodeSum(root.right);
    }

    private static Node buildTree() {
        Node root = new Node();
        root.val = scanner.nextInt();

        boolean left = scanner.nextBoolean();
        if (left){
            root.left = buildTree();
        }

        boolean right = scanner.nextBoolean();
        if (right){
            root.right = buildTree();
        }

        return root;
    }
}
