/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int dm;
    int help(TreeNode root){
        if (root==null) return 0;
        int lh= help(root.left);
        int rh=help(root.right);
        if((lh+rh)>dm) dm= lh+rh;
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
      dm=0;
      help(root);
      return dm;  
    }
}