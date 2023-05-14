package lec43;

public class Validate_BST {
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
        public boolean isValidBST(TreeNode root) {
            return validBST(root).BST;
        }
        public BstPair validBST(TreeNode root) {
            if (root == null)return new BstPair();

            BstPair lbstp = validBST(root.left);
            BstPair rbstp = validBST(root.right);
            BstPair sbstp = new BstPair();
            sbstp.max = Math.max(root.val,Math.max(lbstp.max,rbstp.max));
            sbstp.min = Math.min(root.val,Math.min(lbstp.min,rbstp.min));
            if (lbstp.BST && rbstp.BST && lbstp.max < root.val && rbstp.min > root.val){
                sbstp.BST = true;
            }else {
                sbstp.BST = false;
            }
            return sbstp;
        }
    }
    class BstPair{
        boolean BST = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
    }
}
