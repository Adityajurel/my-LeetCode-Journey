class Solution {
    int dp[];
    int help(int i , int[] cost){
        if(i>=cost.length) return 0;
            if(dp[i]!=-1) return dp[i];
         return dp[i]=cost[i]+Math.min(help(i+1,cost),help(i+2,cost));
        
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(help(0,cost),help(1,cost));
    }
}