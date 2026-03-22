class Solution {
     static void swap(int[]nums,int st, int end){

        
            int temp = nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            end--;
            st++;
        }
    public void moveZeroes(int[] nums) {
        int j =-1;
        int n = nums.length;
        for(int  i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int  i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }

    }
}
