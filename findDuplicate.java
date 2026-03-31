class Solution {
    static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int  i=0;
        while(i<n){
            if(i==arr[i]-1) i++;
            else{
                int idx = arr[i]-1;
                if(arr[i]==arr[idx]) return arr[i];
                swap(arr,idx,i);
                
            }
        }
        return n-1;
    }
}
