class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        List<List<Integer>> dp = new ArrayList<>();
        int ans=Integer.MAX_VALUE;
        for(int i =0;i<t.size();i++){
            List<Integer> temp = new ArrayList<>();
            for(int j =0;j<t.get(i).size();j++){
                if(i==0&&j==0) temp.add(t.get(i).get(j));
                else if(j==0) temp.add(t.get(i).get(j)+dp.get(i-1).get(j));
                else if(j==i)temp.add(t.get(i).get(j)+dp.get(i-1).get(j-1));
                else temp.add(t.get(i).get(j)+Math.min(dp.get(i-1).get(j),dp.get(i-1).get(j-1)));
            }
            dp.add(temp);
        if(i==t.size()-1){
            for(int k=0;k<temp.size();k++){
                ans=Math.min(ans,temp.get(k));
            }
        }
        }
    return ans;
    }
}