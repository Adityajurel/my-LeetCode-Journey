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
 class pair{
    TreeNode t;
    int col;
    pair(TreeNode t,int col){
        this.t=t;
        this.col=col;
    }
 }
class Solution {
    void rsv(TreeNode root,List<Integer> ans){
        Queue <pair> q= new LinkedList<>();
        q.add(new pair(root,0));
        TreeMap<Integer,Integer> map = new TreeMap<>();
      
        while(q.size()!=0){
            pair top= q.remove();
            map.put(top.col,top.t.val);
            if(top.t.left!=null) q.add(new pair(top.t.left,top.col+1));
            if(top.t.right!=null) q.add(new pair(top.t.right,top.col+1));

        }
        for(int e:map.values()) ans.add(e);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        rsv(root,ans);
        return ans;
    }
}