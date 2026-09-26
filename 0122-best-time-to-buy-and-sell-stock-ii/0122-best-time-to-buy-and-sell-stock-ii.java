class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int mp=0;
        for(int i =1;i<prices.length;i++){
            min = Math.min(prices[i],min);
          if(prices[i]>min){
            mp+=prices[i]-min;
            min=prices[i];
          }
        }
        return mp;
    }
}