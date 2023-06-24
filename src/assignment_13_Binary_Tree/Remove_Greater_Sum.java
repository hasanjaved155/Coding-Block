package assignment_13_Binary_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Greater_Sum {
    static class Node {
        int val;
        Node left, right;
    }

    static Scanner scanner = new Scanner(System.in);
    static int sum = 0;

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node root = creatTree(arr,0,arr.length - 1);
        sum_Of_Greater(root);
        preOrder(root);
    }

    private static void preOrder(Node root) {
        if (root == null){
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void sum_Of_Greater(Node node) {
        if (node == null){
            return;
        }

        sum_Of_Greater(node.right);
        sum = node.val + sum;
        node.val = sum;
        sum_Of_Greater(node.left);
    }

    private static Node creatTree(int[] in, int start, int end) {
        if (start > end){
            return null;
        }
        int mid = (start + end) / 2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left = creatTree(in,start,mid - 1);
        nn.right = creatTree(in,mid + 1,end);
        return nn;
    }
}

