class Solution {
    static int bs(int[]arr,int low,int high,int target ){
        if(low>high) return -1;
        int idx = low+(high-low)/2;
        if(arr[idx]== target) return idx;
        else if(arr[idx]>target) return bs(arr,low,idx-1,target);
    else return bs(arr,idx+1,high,target);    
    }
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
}
