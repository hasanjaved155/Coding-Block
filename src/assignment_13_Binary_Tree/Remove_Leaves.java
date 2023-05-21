package assignment_13_Binary_Tree;

import java.util.Scanner;

public class Remove_Leaves {
    static class Node{
        int val;
        Node left,right;
    }
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = buildTree();
        root = removeLeafs(root);
        preOrder(root);
    }

    private static void preOrder(Node node) {
        if (node == null)return;

        String ans = "";
        ans = ans + node.val;
        ans = " => "+ ans + " <= ";
        if (node.left != null){
            ans = node.left.val + ans;
        }else{
            ans = "END" + ans;
        }

        if (node.right != null){
            ans = ans + node.right.val;
        }else{
            ans = ans + "END";
        }

        System.out.println(ans);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static Node removeLeafs(Node node) {
        if(node.left!=null){
            if(node.left.left==null && node.left.right==null){
                node.left = null;
            }else {
                node.left = removeLeafs(node.left);
            }
        }

        if (node.right!=null){
            if (node.right.left==null && node.right.right==null){
                node.right = null;
            }else{
                node.right = removeLeafs(node.right);
            }
        }
        return node;
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
