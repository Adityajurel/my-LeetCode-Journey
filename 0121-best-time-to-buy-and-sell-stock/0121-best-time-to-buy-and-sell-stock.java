class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max= Integer.MIN_VALUE;
        int mp =0;
        for(int i =1;i<prices.length;i++){
            min =Math.min(prices[i],min);
            mp = Math.max(mp,prices[i]-min);
            // max= Math.max(prices[i],max);

        }
        return mp;
    }
}