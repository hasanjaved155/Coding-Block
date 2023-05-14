package lec42;
public class Binary_Search_Tree_2 {
    //static Node root;
//    public Binary_Search_Tree_2(int[] in){
//        root = creatTree(in,0,in.length - 1);
//    }

    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60};
        Node root = creatTree(arr,0,arr.length - 1);
        //Binary_Search_Tree_2 bst = new Binary_Search_Tree_2(arr);
        creatTree(arr,0,arr.length - 1);
        display(root);
        System.out.println("\n" + minBST(root));
    }
    private static int minBST(Node node) {
        if (node == null)return Integer.MAX_VALUE;

        int left = minBST(node.left);
        return Math.min(left,node.val);
    }

    private static void display(Node node) {
        if (node == null)return;
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }

    public static Node creatTree(int[] in, int start, int end) {
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
