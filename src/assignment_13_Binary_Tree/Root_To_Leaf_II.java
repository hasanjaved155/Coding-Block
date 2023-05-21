package assignment_13_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Root_To_Leaf_II {
    static class Node{
        int val;
        Node left,right;
    }
    static Scanner scanner = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {
        Node root = buildTree();
        int target = scanner.nextInt();
        rootToLeaf(root,target);
        System.out.println(count);
    }

    private static void rootToLeaf(Node root, int target) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            int x = target - root.val;
            if (x == 0) {
                count++;
            }
            return;
        }
        rootToLeaf(root.left,target - root.val);
        rootToLeaf(root.right,target - root.val);
    }

    private static Node buildTree() {
        Node root = new Node();
        root.val = scanner.nextInt();

        Queue<Node>q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node node = q.remove();

            int x = scanner.nextInt();
            if (x != -1){
                Node leftNode = new Node();
                leftNode.val = x;
                node.left = leftNode;
                q.add(leftNode);
            }

            int y = scanner.nextInt();
            if (y != -1){
                Node rightNode = new Node();
                rightNode.val = y;
                node.right = rightNode;
                q.add(rightNode);
            }
        }
        return root;
    }
}
