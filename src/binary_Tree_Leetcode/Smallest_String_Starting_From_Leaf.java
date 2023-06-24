package binary_Tree_Leetcode;

import java.util.LinkedList;

public class Smallest_String_Starting_From_Leaf {
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
        String ans = "";
        String y = "";
        String res = "";
        int a = 65;
        public String smallestFromLeaf(TreeNode root) {
            String ans1 = smallestLeaf(root.left);
            y = "";
            String ans2 = smallestLeaf(root.right);
            int x1 = Integer.parseInt(ans1);
            int y1 = Integer.parseInt(ans2);
            if (x1 < y1){
                ans = ans + ans1 + root.val;
            }else {
                ans = ans + ans2 + root.val;
            }
            for (int i = 0; i < ans.length(); i++) {
                int digit = ans.charAt(0) - '0';
            }
            return res;
        }

        private String smallestLeaf(TreeNode root) {
            if (root ==null)return null;
            if (root.left == null && root.right == null){
                String x = "";
                x = x + root.val;
                return x;
            }

            String left = smallestLeaf(root.left);
            String right = smallestLeaf(root.right);
            int x1 = Integer.parseInt(left);
            int y1 = Integer.parseInt(right);
            if (x1 < y1){
                y = y + left + root.val;
            }else {
                y = y + right + root.val;
            }
            return y;
        }
    }
}
