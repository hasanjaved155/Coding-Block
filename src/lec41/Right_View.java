package lec41;

import java.util.LinkedList;
import java.util.List;

public class Right_View {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer>list = new LinkedList<>();
            binaryView(root,list,0);
            return list;
        }
        int max_depth = -1;
        public void binaryView(TreeNode root , List<Integer>list,int curr){
            if (root == null){
                return;
            }
            if (max_depth < curr){
                list.add(root.val);
                max_depth = curr;
            }

            binaryView(root.right,list,curr + 1);
            binaryView(root.left,list,curr + 1);
        }
    }
}
