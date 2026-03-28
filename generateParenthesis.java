class Solution {
    static void gp(List<String> ans,String curr,int op,int cl,int n){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
    if(op<n) gp(ans,curr+"(",op+1,cl,n);
     if(cl<op) gp(ans,curr+")",op,cl+1,n);

    }
    public List<String> generateParenthesis(int n) {
        List <String> ans = new ArrayList<>();
        gp(ans,"",0,0,n);
        return ans;
    }
}
