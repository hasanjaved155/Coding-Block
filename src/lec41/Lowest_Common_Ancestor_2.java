package lec41;

public class Lowest_Common_Ancestor_2 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (!find(root, p) || !find(root, q))return null;

            else return lca(root,p,q);
        }

        public boolean find(TreeNode root, TreeNode x) {
            if (root == null)return false;
            if (root == x)return true;

            return find(root.left , x) || find(root.right , x);
        }

        public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null)return null;
            if (root == p || root == q)return root;
            TreeNode left = lca(root.left,p,q);
            TreeNode right = lca(root.right,p,q);
            if (left != null && right != null)return root;
            if (left == null)return right;
            else return left;
        }
    }
}
