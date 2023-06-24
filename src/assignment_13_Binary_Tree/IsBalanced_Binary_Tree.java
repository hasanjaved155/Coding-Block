package assignment_13_Binary_Tree;

import lec42.Balanced_Binary_Tree_2;

import java.util.Scanner;

public class IsBalanced_Binary_Tree {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        IsBalanced_Binary_Tree m = new IsBalanced_Binary_Tree();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public boolean isBalanced() {
            return this.isBalanced(this.root).isBalanced;
        }

        private BalancedPair isBalanced(Node root) {
            if (root == null)return new BalancedPair();

            BalancedPair left = isBalanced(root.left);
            BalancedPair right = isBalanced(root.right);

            BalancedPair self = new BalancedPair();
            self.height = Math.max(left.height , right.height) + 1;
            int bf = Math.abs(left.height - right.height);
            self.isBalanced = left.isBalanced && right.isBalanced && bf <= 1;
            return self;

        }

        private class BalancedPair {
            int height;
            boolean isBalanced = true;
        }

    }
}
