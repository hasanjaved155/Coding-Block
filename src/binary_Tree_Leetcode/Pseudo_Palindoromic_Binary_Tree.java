package binary_Tree_Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Pseudo_Palindoromic_Binary_Tree {
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
        int count = 0;
        public int pseudoPalindromicPaths (TreeNode root) {
            HashMap<Integer,Integer>map = new HashMap<>();
            pseudo(root,map);
            return count;
        }

        private void pseudo(TreeNode root, HashMap<Integer, Integer>map) {
            if (root == null){
                return;
            }
            if (root.left == null && root.right == null){
                if (!map.containsKey(root.val)){
                    map.put(root.val, 1);
                }else {
                    map.put(root.val,map.get(root.val) + 1);
                }
                int x = 0;
                for (Map.Entry<Integer,Integer>m : map.entrySet()){
                    if (m.getValue() % 2 != 0){
                        x++;
                    }
                }
                if (x <= 1){
                    count++;
                }
                map.put(root.val,map.get(root.val) - 1);
                return;

            }

            if (!map.containsKey(root.val)){
                map.put(root.val, 1);
            }else {
                map.put(root.val,map.get(root.val) + 1);
            }
            pseudo(root.left,map);
            pseudo(root.right,map);
            map.put(root.val,map.get(root.val) - 1);
        }
    }
}
