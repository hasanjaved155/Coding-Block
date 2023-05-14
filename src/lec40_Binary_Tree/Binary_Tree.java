package lec40_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    Scanner scanner = new Scanner(System.in);
    public Binary_Tree(){
        root = createTree();
    }

    private Node createTree() {
        int item = scanner.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = scanner.nextBoolean();
        if (hlc){
            nn.left = createTree();
        }
        boolean hrc = scanner.nextBoolean();
        if (hrc){
            nn.right = createTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if (nn == null){
            return;
        }

        String s = "";
        s = s + nn.data;
        s = "<--" + s + "-->";
        if (nn.left != null){
            s = nn.left.data + s;
        }else{
            s = "." + s;
        }
        if (nn.right != null){
            s = s + nn.right.data;
        }else{
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if (nn == null){
            return Integer.MIN_VALUE;
        }
         int left = max(nn.left);
         int right = max(nn.right);
         return Math.max(left,Math.max(right,nn.data));
    }
    public boolean search(int item){
        return search(root,item);
    }
    private boolean search(Node nn , int item){
        if (nn == null)return false;
        if (nn.data == item)return true;

        boolean left = search(nn.left,item);
        boolean right = search(nn.right,item);
        return left || right;
    }
    public int height(){
        return height(root);
    }
    private int height(Node nn){
        if (nn == null)return -1;

        int left = height(nn.left);
        int right = height(nn.right);
        return Math.max(left,right) + 1;
    }

    //--------------------------------------------- Traversal--------------------------------------------------------//
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node nn) {
        if (nn == null)return;
        System.out.print(nn.data + " ");
        preOrder(nn.left);
        preOrder(nn.right);
    }
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node nn) {
        if (nn == null)return;
        inOrder(nn.left);
        System.out.print(nn.data + " ");
        inOrder(nn.right);
    }
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node nn) {
        if (nn == null)return;
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.print(nn.data + " ");
    }

    //---------------------------------------------------LevelOrder--------------------------------------------------//
    public void levelOrder() {
        Queue<Node>q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node remove = q.remove();
            System.out.print(remove.data + " ");
            if (remove.left != null){
                q.add(remove.left);
            }
            if (remove.right != null){
                q.add(remove.right);
            }
        }
        System.out.println();
    }
}
