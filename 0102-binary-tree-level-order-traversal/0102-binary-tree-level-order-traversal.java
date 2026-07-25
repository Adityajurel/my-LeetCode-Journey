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
    TreeNode a;
    int b;
    pair(TreeNode a,int b){
        this.a=a;
        this.b=b;
    }
 }
class Solution {
    void bfs(TreeNode root,List<List<Integer>> ans){

        Queue<pair> q = new LinkedList<>();
        int lvl=0;
        ArrayList <Integer> arr= new ArrayList<>();
        q.add(new pair(root,0));
        while(q.size()!=0){
            pair top= q.remove();
            if(top.b==lvl){
                arr.add(top.a.val);
            }
            else{
                ans.add(arr);
                lvl++;
                arr= new ArrayList<>();
                arr.add(top.a.val);
            }
        
            if(top.a.left!=null)q.add(new pair(top.a.left,top.b+1));
            if(top.a.right!=null)q.add(new pair(top.a.right,top.b+1));

        }
        ans.add(arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        bfs(root,ans);
        return ans;
    }
}