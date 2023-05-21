package assignment_13_Binary_Tree;

import java.util.Scanner;

public class Root_To_Leaf {
    static class Node{
        int val;
        Node left,right;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = buildTree();
        int target = scanner.nextInt();
        rootToLeaf(root,target,"");
    }

    private static void rootToLeaf(Node root, int target, String ans) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            int x = target - root.val;
            if (x == 0) {
                ans = ans + root.val + " ";
                System.out.println(ans);
            }
            return;
        }
        rootToLeaf(root.left,target - root.val,ans + root.val + " ");
        rootToLeaf(root.right,target - root.val,ans + root.val + " ");
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
