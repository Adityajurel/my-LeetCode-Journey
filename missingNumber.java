class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i =0;
        while(i<n){
            if(nums[i]>=n||i==nums[i]) i++;
            else{
                int idx=nums[i];
                int temp = nums[i];
                nums[i]= nums[idx];
                nums[idx]=temp;
            }  
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j)return j;
        }
        return n;
    }
}
