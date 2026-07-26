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
    boolean flag;
    int ib(TreeNode root){
        if(root==null) return 0;

        int lh=ib(root.left);
        int rh=ib(root.right);
        if(Math.abs(lh-rh)>1)flag=false;
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
         flag= true;
        ib(root);
        return flag;
    }
}