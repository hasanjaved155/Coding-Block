package assignment_13_Binary_Tree;

public class Path_Sum_3 {
    public class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;


        TreeNode() {
        }


        TreeNode(int val) {
            this.val = val;
        }


        TreeNode(int val, TreeNode left, TreeNode right) {
 this.val = val;
 this.left = left;
 this.right = right;
 }

    }


    class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            if (root == null)return 0;

            int count = countPath(root , targetSum);
            int left = pathSum(root.left, targetSum);
            int right = pathSum(root.right , targetSum);
            return count + left + right;
        }
        public int countPath(TreeNode root, int target){
            if (root == null)return 0;

            int count = 0;
            if (root.val - target == 0){
                count++;
            }
            count += countPath(root.left , target - root.val);
            count += countPath(root.right , target - root.val);
            return count;
        }
    }
}