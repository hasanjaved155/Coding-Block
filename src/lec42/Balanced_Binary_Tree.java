package lec42;

public class Balanced_Binary_Tree {
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
        public boolean isBalanced(TreeNode root) {
            if (root == null)return true;
            boolean left = isBalanced(root.left);
            boolean right = isBalanced(root.right);
            boolean self = Math.abs(height(root.left) - height(root.right)) <= 1;
            return left && right && self;
        }
        public int height(TreeNode nn){// nn is root
            if (nn == null)return -1;

            int left = height(nn.left);
            int right = height(nn.right);
            return Math.max(left,right) + 1;
        }
    }
}
