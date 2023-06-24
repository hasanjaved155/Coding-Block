package lec41;

public class Sum_Root_To_Leaf_Node_2 {
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
        public int sumNumbers(TreeNode root) {
            return sum(root,"");
        }
        public int sum(TreeNode root, String ans) {
            if (root == null)return 0;
            if (root.left == null && root.right == null)return Integer.parseInt(ans + root.val);
            int left = sum(root.left, ans + root.val);
            int right = sum(root.right,ans + root.val);
            return left + right;
        }
    }
}
