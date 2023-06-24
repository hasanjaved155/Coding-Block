package assignment_13_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lowest_Common_Ancestor {
    static class Node {
        int val;
        Node left, right;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = buildTree();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(lca(root,p,q));
    }

    private static int lca(Node root, int p, int q) {
        if (root == null)return 0;
        if (root.val == p || root.val == q)return root.val;
        int left = lca(root.left,p,q);
        int right = lca(root.right,p,q);
        if (left != 0 && right != 0)return root.val;
        if (left == 0)return right;
        else return left;
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

