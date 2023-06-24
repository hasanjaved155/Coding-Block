package binary_Tree_Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Delete_Nodes_Return_Forest {
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
        public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            LinkedList<TreeNode>list = new LinkedList<>();
            TreeNode node = deleteNodes(root,to_delete,list);
            if (!find(to_delete,root.val)){
            list.add(node);
            }
            return list;
        }

        private TreeNode deleteNodes(TreeNode root, int[] to_delete, LinkedList<TreeNode> list) {
            if (root == null)return null;

            root.left = deleteNodes(root.left,to_delete,list);
            root.right = deleteNodes(root.right,to_delete,list);
            if (find(to_delete,root.val)){
                if (root.left != null){
                    list.add(root.left);
                }
                if (root.right != null){
                    list.add(root.right);
                }
                return null;
            }else {
                return root;
            }
        }

        private boolean find(int[] to_delete, int val) {
            for (int i = 0; i < to_delete.length; i++) {
                if (to_delete[i] == val){
                    return true;
                }
            }
            return false;
        }
    }
}
