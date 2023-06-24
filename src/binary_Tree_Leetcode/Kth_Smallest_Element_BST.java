package binary_Tree_Leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Kth_Smallest_Element_BST {
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
        public int kthSmallest(TreeNode root, int k) {
            LinkedList<Integer>list = new LinkedList<>();
            kthSmallestElement(list,root);
            return list.get(k - 1);
//            PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
//            for (int i = 0; i < k; i++) {
//                pq.add(list.get(i));
//            }
//            for (int i = k; i < list.size() ; i++) {
//                if (list.get(i) < pq.peek()){
//                    pq.remove();
//                    pq.add(list.get(i));
//                }
//            }
//            //System.out.println(list);
//            return pq.peek();
        }
        private void kthSmallestElement(LinkedList<Integer> list, TreeNode root) {
            if (root == null)return;

            kthSmallestElement(list,root.left);
            list.add(root.val);
            kthSmallestElement(list,root.right);
        }
    }
}
