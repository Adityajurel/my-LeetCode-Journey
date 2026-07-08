class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmax=height[0];
        int rmax=height[n-1];
        int l=0;int r=n-1;
        int ans =0;
        while(l<r){
            if(height[l]<=height[r]){
                lmax=Math.max(height[l],lmax);
                ans+=lmax-height[l];
                l++;
            }else{
               rmax=Math.max(height[r],rmax);
                ans+=rmax-height[r];
                r--;   
            }
            
        }
        return ans;
    }
}