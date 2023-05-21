package assignment_13_Binary_Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Level_Order_Zig_Zag {
    static class Node {
        int val;
        Node left, right;
    }

    // 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, LinkedList<Integer>> l = new HashMap<>();
    static int levelMax = 0;

    public static void main(String[] args) {


        Node root = buildTree();

        printPreOrder(root, 1);
        display();
    }

    private static void printPreOrder(Node node, int level) {
        if (node == null) {
            return;
        }

        LinkedList<Integer> list = l.get(level);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(node.val);
        l.put(level, list);

        if (level > levelMax) {
            levelMax = level;
        }
        printPreOrder(node.left, level + 1);
        printPreOrder(node.right, level + 1);
    }

    private static Node buildTree() {
        Node node = new Node();
        node.val = scanner.nextInt();

        boolean left = scanner.nextBoolean();
        if (left) {
            node.left = buildTree();
        }

        boolean right = scanner.nextBoolean();
        if (right) {
            node.right = buildTree();
        }

        return node;
    }

    private static void display() {
        for (int i = 1; i <= levelMax; i++) {
            LinkedList<Integer> le = l.get(i);
            if (i % 2 == 0) {
                for (int j = le.size() - 1; j >= 0; j--) {
                    System.out.print(le.get(j) + " ");
                }
            } else {
                for (int j = 0; j < le.size(); j++) {
                    System.out.print(le.get(j) + " ");
                }
            }
        }
    }
}
