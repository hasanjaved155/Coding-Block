package assignment_13_Binary_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Lowest_Common_Ancestor_2_BST {
    static class Node {
        int val;
        Node left, right;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Node root = creatTree(arr,0,arr.length - 1);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(lca(root,p,q));
    }

    private static Node creatTree(int[] arr, int start, int end) {
        if (start > end)return null;

        Node root = new Node();
        int mid = (start + end) / 2;
        root.val = arr[mid];
        root.left = creatTree(arr,0,mid - 1);
        root.right = creatTree(arr,mid + 1,end);
        return root;
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
}

