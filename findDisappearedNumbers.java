class Solution {
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans= new ArrayList<>() ;
        int n = arr.length;
        int i =0;
        while(i<n){
            if(i==arr[i]-1)i++;
            else{
                int idx = arr[i]-1;
                if(arr[i]==arr[idx]) i++;
               else swap(arr,idx,i);
            }
        }
        for(int j = 0;j<n;j++){
            if(j!=arr[j]-1) {
                ans.add(j+1);
            }
        }
        return ans;
    }
}
