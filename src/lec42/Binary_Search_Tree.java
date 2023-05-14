package lec42;

class Node{
    int val;
    Node left;
    Node right;
}
public class Binary_Search_Tree {
    Node root;
    public Binary_Search_Tree(int[] in){
        root = creatTree(in,0,in.length - 1);
    }

    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60};
        Binary_Search_Tree bst = new Binary_Search_Tree(arr);
        bst.creatTree(arr,0,arr.length - 1);
        bst.display(bst.root);
        System.out.println();
        System.out.println(bst.minBST(bst.root));
    }

    private void display(Node node) {
        if (node == null)return;
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }
    private int minBST(Node node) {
        if (node == null)return Integer.MAX_VALUE;

        int left = minBST(node.left);
        return Math.min(left,node.val);
    }

    public Node creatTree(int[] in, int start, int end) {
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
