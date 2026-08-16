class Solution {
    int[]dp;
    int help(int i ,int[]nums){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+help(i+2,nums);
        int skip = help(i+1,nums);
        return dp[i]= Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return help(0,nums);
    }
}