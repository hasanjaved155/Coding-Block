package dp_leetcode;

import java.util.ArrayList;
import java.util.List;

public class Unique_BST_2 {
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
        public List<TreeNode> generateTrees(int n) {
            return generate(1,n);
        }

        private List<TreeNode> generate(int l, int r) {
            List<TreeNode> listNodes = new ArrayList<>();
            if (l >= r){
                if (l == r){
                    TreeNode node = new TreeNode(l);
                    listNodes.add(node);
                }else {
                    listNodes.add(null);
                }
                return listNodes;
            }

            for (int i = l; i <= r; i++) {
                List<TreeNode>left = generate(l,i - 1);
                List<TreeNode>right = generate(i + 1,r);
                for (TreeNode ln : left){
                    for (TreeNode rn : right){
                        TreeNode root = new TreeNode(i);
                        root.left = ln;
                        root.right = rn;
                        listNodes.add(root);
                    }
                }
            }
            return listNodes;
        }
    }
}
