class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;int high=nums.length-1;
        int[]arr = {-1,-1};
        while(low<=high){
            int mid = (low +high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high=mid-1;
                arr[0]=mid;
            }
        }
        low =0; high =nums.length-1;
         while(low<=high){
            int mid = (low +high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                low=mid+1;
                arr[1]=mid;
            }
            
        }
        return arr;
    }
}
