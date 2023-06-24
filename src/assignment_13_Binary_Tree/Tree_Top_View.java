package assignment_13_Binary_Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree_Top_View {
    static class Node{
        int val;
        Node left, right;
    }
    static int minVariance = 0;
    static int maxVariance = 0;
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, LinkedList<Integer>> top = new HashMap<>();

    public static void main(String[] args) {
        Node root = buildTree();
        topView(root,0,0);
        display();
    }

    private static void display() {
        for (int i = minVariance; i <= maxVariance; i++) {
            System.out.print(top.get(i).get(1) + " ");
        }
    }

    private static void topView(Node root,int level,int variance) {
        if (root == null)return;
        minVariance = Math.min(minVariance, variance);
        maxVariance = Math.max(maxVariance, variance);

        LinkedList<Integer>list = top.get(variance);
        if (list == null){
            list = new LinkedList<>();
            list.add(level);
            list.add(root.val);
        } else if (level <= list.get(0)) {
            list = new LinkedList<>();
            list.add(level);
            list.add(root.val);
        }
        top.put(variance, list);
        topView(root.left, level + 1, variance - 1);
        topView(root.right, level + 1, variance + 1);
    }

    private static Node buildTree() {
        Node node = new Node();
        node.val = scanner.nextInt();
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Node first = q.poll();

            int left = scanner.nextInt();
            if (left != -1){
                Node leftNode = new Node();
                leftNode.val = left;
                first.left = leftNode;
                q.add(leftNode);
            }

            int right = scanner.nextInt();
            if (right != -1){
                Node rightNode = new Node();
                rightNode.val = right;
                first.right = rightNode;
                q.add(rightNode);
            }
        }
        return node;
    }
}
