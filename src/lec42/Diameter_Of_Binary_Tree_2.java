package lec42;

public class Diameter_Of_Binary_Tree_2 {
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
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).dia;
        }

        public DiaPair diameter(TreeNode root) {
            if (root == null){
                return new DiaPair();
            }
            DiaPair ldp = diameter(root.left);
            DiaPair rdp  = diameter(root.right);
            DiaPair sdp = new DiaPair();
            sdp.height = Math.max(ldp.height , rdp.height) + 1;
            int sd = ldp.height + rdp.height + 2;
            sdp.dia = Math.max(sd,Math.max(ldp.dia,rdp.dia));
            return sdp;
        }
    }
    class DiaPair {
        int height = -1;
        int dia = 0;
    }
}
