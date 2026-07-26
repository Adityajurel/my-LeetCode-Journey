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
    int ib(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(ib(root.left),ib(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh = ib(root.left);
        int rh= ib(root.right);
        if(Math.abs(lh-rh)>1) return false;
        if (isBalanced(root.left)&&isBalanced(root.right)) return true;
        else return false;
        
        }
}