package binary_Tree_Leetcode;

public class Binary_Tree_Maximum_Path_Sum {
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
        int result = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            int ans = maxPath(root);

            return Math.max(ans,result);
        }

        private int maxPath(TreeNode root) {
            if (root == null)return 0;

            int left = maxPath(root.left);
            int right = maxPath(root.right);

            int max1 = Math.max(Math.max(left,right) + root.val, root.val);
            int max2 = Math.max(max1,left + right + root.val);
            result = Math.max(max2,result);
            return max1;
        }
    }
}
