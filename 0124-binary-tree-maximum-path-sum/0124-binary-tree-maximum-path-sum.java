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
    int mp;
    int help(TreeNode root){
        if(root==null) return -10000;
        int lv= help(root.left);
        int rv= help(root.right);
        mp=Math.max(mp,Math.max(root.val,Math.max(root.val+lv+rv,Math.max(root.val+Math.max(lv,rv),Math.max(lv,rv)))));
        return Math.max(root.val,root.val+Math.max(lv,rv));
    }
    public int maxPathSum(TreeNode root) {
        mp=Integer.MIN_VALUE;
        help(root);
        return mp;
    }
}