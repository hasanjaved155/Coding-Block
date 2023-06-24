package assignment_13_Binary_Tree;

import lec43.Validate_BST;

import java.util.Scanner;

public class Largest_BST_Binary_Tree {
    static class Node{
        Node left,right;
        int val;
    }
    static class BstPair{
        boolean BST = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int size = 0;
    }
    static int[] arr1;
    static int[] arr2;
    static int p1 = 0;
    static int count = 0;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        Node root = preAndIn(0,n - 1);
        int ans = isValidBST(root);
        System.out.println(ans);
    }

    public static int isValidBST(Node root) {
        return validBST(root).size;
    }
    public static BstPair validBST(Node root) {
        if (root == null)return new BstPair();

        BstPair lbstp = validBST(root.left);
        BstPair rbstp = validBST(root.right);
        BstPair sbstp = new BstPair();
        sbstp.max = Math.max(root.val,Math.max(lbstp.max,rbstp.max));
        sbstp.min = Math.min(root.val,Math.min(lbstp.min,rbstp.min));
        if (lbstp.BST && rbstp.BST && lbstp.max < root.val && rbstp.min > root.val){
            sbstp.BST = true;
            sbstp.size = lbstp.size + rbstp.size + 1;
        }else {
            sbstp.BST = false;
            sbstp.size = Math.max(lbstp.size , rbstp.size);
        }
        return sbstp;
    }
    private static Node preAndIn(int start, int end) {
        if (start > end)return null;

        Node root = new Node();
        root.val = arr1[p1];
        p1++;
        if (start == end)return root;

        int i = start;
        for (; i <= end ; i++) {
            if (arr2[i] == root.val)break;
        }
        root.left = preAndIn(start , i - 1);
        root.right = preAndIn(i + 1 , end);

        return root;
    }
}
