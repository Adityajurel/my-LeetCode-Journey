class Solution {
    static void revArray(int[]nums,int st, int end){

        while(st<end){
            int temp = nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            end--;
            st++;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        revArray(nums,n-k,n-1);
        revArray(nums,0,n-k-1);
        revArray(nums,0,n-1);
    }
}
