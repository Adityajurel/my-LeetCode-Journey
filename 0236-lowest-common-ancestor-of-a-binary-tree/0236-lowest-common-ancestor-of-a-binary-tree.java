/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean isExist(TreeNode root,TreeNode p){
        if(root==null) return false;
        if(root==p) return true;
       return isExist(root.left,p)||isExist(root.right,p);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     if(root==p) return p;
     if(root==q) return q;
      if((isExist(root.left,p)&&isExist(root.right,q))||(isExist(root.left,q)&&isExist(root.right,p))) return root;
      else if((isExist(root.left,p)&&!isExist(root.right,q))) return lowestCommonAncestor(root.left,p,q);
      else  return lowestCommonAncestor(root.right,p,q);
    }
}