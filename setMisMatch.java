class Solution {

        static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int []arr = new int[2];
        int  i=0;
        while(i<n){
            int idx = nums[i]-1;
            if(nums[i]==nums[idx]||i == nums[i]-1)i++;
            else swap(nums,idx,i);
        }
    for(int j =0;j<n;j++){
        if(j!=nums[j]-1) {
            arr[0]=nums[j];
            arr[1] = j+1;
        }

    }
    return arr;
    }
}
