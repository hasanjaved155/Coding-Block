package binary_Tree_Leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Kth_Smallest_Element_BST_2 {
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
        int ans = -1;
        public int kthSmallest(TreeNode root, int k) {
            kthSmallestTree(root,k);
            return ans;
        }
        int i = 1;
        private void kthSmallestTree(TreeNode root, int k) {
           if (root == null)return;

           kthSmallestTree(root.left,k);
           if (i == k){
               ans = root.val;
               i++;
           }else {
               i++;
           }
           kthSmallestTree(root.right,k);
        }
    }
}
