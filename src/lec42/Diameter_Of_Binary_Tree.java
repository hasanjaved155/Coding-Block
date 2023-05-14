package lec42;

import lec40_Binary_Tree.Binary_Tree;

public class Diameter_Of_Binary_Tree {
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
            if (root == null)return 0;
            int ld = diameterOfBinaryTree(root.left);
            int rd = diameterOfBinaryTree(root.right);
            int sd = height(root.left) + height(root.right) + 2;
            return Math.max(rd,Math.max(ld,sd));
        }
        public int height(TreeNode nn){// nn is root
            if (nn == null)return -1;

            int left = height(nn.left);
            int right = height(nn.right);
            return Math.max(left,right) + 1;
        }
    }
}
