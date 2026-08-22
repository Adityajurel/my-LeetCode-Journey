class Solution {
    int[] dp;
int cs(int n ){
    if(n<=2) return n;
    if(dp[n]!=-1) return dp[n];
    return dp[n]=cs(n-1)+cs(n-2);
}
    public int climbStairs(int n) {
    dp= new int[n+1];
    Arrays.fill(dp,-1);
 
    return cs(n);
    }
}