package assignment_13_Binary_Tree;

import java.util.Scanner;

public class Structural_Identical {
    static class Node{
        int val;
        Node left,right;
    }
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node root1 = buildTree();
        Node root2 = buildTree();
        boolean ans = structural_Identical(root1,root2);
        System.out.println(ans);
    }

    private static boolean structural_Identical(Node root1, Node root2) {
        if (root1 == null && root2 == null)return true;
        if (root1 == null || root2 == null)return false;
        //if (root1.val != root2.val)return false;
        boolean left = structural_Identical(root1.left , root2.left);
        boolean right = structural_Identical(root1.right , root2.right);
        return left && right;
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
