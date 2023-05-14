package lec43;

public class Construct_Tree_With_PreOrder_InOrder {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return build(preorder,inorder,0,preorder.length - 1,0,inorder.length - 1);
        }
        public TreeNode build(int[] pre, int[] in, int plo ,int phi ,int ilo ,int ihi) {
            if (plo > phi || ilo > ihi)return null;

            TreeNode node = new TreeNode(pre[plo]);
            int idx = search(in,ilo,ihi,pre[plo]);

            int diff = idx - ilo;
            node.left = build(pre,in,plo + 1,phi + diff,ilo,idx - 1);
            node.right = build(pre,in,plo + diff + 1,phi,idx + 1,ihi);
            return node;
        }
        public int search(int[] in , int ilo, int ihi, int item){
            for (int i = ilo; i <= ihi; i++) {
                if (in[i] == item){
                    return i;
                }
            }
            return 0;
        }
    }
}
