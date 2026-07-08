class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int []pfs = new int[n];
        int []sfs= new int[n];
        if(n==1) return 0;
        pfs[0]=height[0];
        sfs[n-1]=height[n-1];
             for(int i =1;i<n;i++){
                pfs[i]=Math.max(height[i],pfs[i-1]);
             }
             for(int i =n-2;i>=0;i--){
                sfs[i]=Math.max(height[i],sfs[i+1]);
             }
             int k=0;
             int totalWater=0;
             while(k<n){
                int minheight=Math.min(pfs[k],sfs[k]);
                if(height[k]<minheight)
                totalWater+=minheight-height[k];
                k++;
             }
             return totalWater;
    }
}