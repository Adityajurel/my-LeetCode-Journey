class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int n = nums.length;
     Deque <Integer> dq= new ArrayDeque<>();
     int lb=0;
     ArrayList<Integer> l = new ArrayList<>();

     if(n==1) return nums;
     for(int i =0;i<n;i++){
        if(i>=k){
            lb++;
            l.add(nums[dq.peekFirst()]);
        }
        while(dq.size()!=0&&dq.peekFirst()<lb)dq.pollFirst();
        while(dq.size()!=0&&nums[dq.peekLast()]<nums[i])dq.pollLast();
        dq.offerLast(i);
     }   
     l.add(nums[dq.peekFirst()]);
     int [] ans = new int[l.size()];
     for(int i =0;i<l.size();i++){
        ans[i]=l.get(i);
     }
     return ans;
    }
}