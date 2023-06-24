package binary_Tree_Leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class All_Elements_Two_BST {
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
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            LinkedList<Integer> list = new LinkedList<>();
            getAll(root1,list);
            getAll(root2,list);
            Collections.sort(list);
            return list;
        }
        private void getAll(TreeNode root, LinkedList<Integer> list) {
            if (root == null)return;
            getAll(root.left,list);
            list.add(root.val);
            getAll(root.right,list);
        }
    }
}