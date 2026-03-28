class Solution {
    static void subSet(List<List<Integer>> arr,List<Integer> current ,int []nums,int idx){
        if(idx==nums.length){
         arr.add(new ArrayList<>(current));
         return;
        }
        int num = nums[idx];
        current.add(num);
        subSet(arr,current,nums,idx+1);
        current.remove(current.size() - 1);
        subSet(arr,current,nums,idx+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> arr= new ArrayList<>();
        subSet(arr, new ArrayList<>(),nums,0);
        return arr;

    }
}
