package binary_Tree_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Path_Sum_II {
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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>>list = new LinkedList<>();
            List<Integer>l = new LinkedList<>();
            pathSum2(root,targetSum,l,list);
            return list;
        }

        private void pathSum2(TreeNode root, int targetSum, List<Integer> l, List<List<Integer>> list) {
            if (root == null)return;
            if (root.left == null && root.right == null){
                if (targetSum - root.val == 0) {
                    List<Integer> a = new LinkedList<>(l);
                    a.add(root.val);
                    list.add(a);
                }
                return;
            }
            l.add(root.val);
            pathSum2(root.left,targetSum - root.val,l,list);
            pathSum2(root.right,targetSum - root.val,l,list);
            l.remove(l.size() - 1);
        }
    }
}
