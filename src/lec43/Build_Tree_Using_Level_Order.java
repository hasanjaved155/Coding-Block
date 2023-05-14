package lec43;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Build_Tree_Using_Level_Order {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner scanner = new Scanner(System.in);
    public Build_Tree_Using_Level_Order(){
        root = createTree();
    }
    private Node createTree(){
        Queue<Node>q = new LinkedList<>();
        int item = scanner.nextInt();
        Node nn = new Node();
        nn.val = item;
        q.add(nn);
        while (!q.isEmpty()){
            Node rn = q.poll();
            // Node rn = q.remove();
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            if (c1 != -1){
                Node n = new Node();
                n.val = c1;
                rn.left = n;
                q.add(n);
            }
            if (c2 != -1){
                Node n = new Node();
                n.val = c2;
                rn.right = n;
                q.add(n);
            }
        }
        return nn;
    }
    public void preorder(){
        preorder(this.root);
        System.out.println();
    }
    private void preorder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Build_Tree_Using_Level_Order cl = new Build_Tree_Using_Level_Order();
        cl.preorder();
    }
}
//10 20 30 40 -1 -1 50 -1 -1 60 -1 -1 -1