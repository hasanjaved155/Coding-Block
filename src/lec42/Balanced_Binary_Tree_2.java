package lec42;

public class Balanced_Binary_Tree_2 {
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


    public class Pair{
        int height = -1;
        boolean isbal = true;
    }
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return isBalancedPair(root).isbal;
        }

        private Pair isBalancedPair(TreeNode root) {
            if (root == null)return new Pair();

            Pair left = isBalancedPair(root.left);
            Pair right = isBalancedPair(root.right);

            Pair self = new Pair();
            self.height = Math.max(left.height , right.height) + 1;
            int bf = Math.abs(left.height - right.height);
            self.isbal = left.isbal && right.isbal && bf <= 1;
            return self;
        }
    }
}
