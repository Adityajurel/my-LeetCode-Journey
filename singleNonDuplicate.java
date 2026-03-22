class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo =0;int hi=n-1;
        if(nums.length ==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        while(lo<=hi){
            int m = lo+(hi-lo)/2;
             int ph =m;
            int du = m;
            if(nums[m]!=nums[m-1]&&nums[m]!=nums[m+1]){
                return nums[m];
            }
           
            else if(nums[m]==nums[m-1]){
                ph =m-1;
            }
            else if(nums[m]==nums[m+1]){
                du =m+1;
            }
           int leftct= ph-lo;
           int rigthct= hi-du;
           if(leftct%2==0) lo= du+1;
           else hi= ph-1;
        }

        return 5;
    }
}
