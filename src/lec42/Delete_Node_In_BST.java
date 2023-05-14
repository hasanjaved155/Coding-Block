package lec42;

public class Delete_Node_In_BST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null)return null;

            if (root.val < key){
                root.right = deleteNode(root.right,key);
            } else if (root.val > key) {
                root.left = deleteNode(root.left,key);
            }else{
                // 1 child or 2 child
                if (root.left == null){
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }else {
                    int min = minBST(root.right);
                    root.val = min;
                    root.right = deleteNode(root.right,min);
                }
            }
            return root;
        }
        public int minBST(TreeNode node) {
            if (node == null)return Integer.MAX_VALUE;

            int left = minBST(node.left);
            return Math.min(left,node.val);
        }
    }
}
