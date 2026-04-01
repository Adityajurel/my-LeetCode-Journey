class Solution {
        static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public int firstMissingPositive(int[] arr) {
        int n =arr.length;
        int i =0;
        while(i<n){
            int idx= arr[i]-1;
            if(arr[i]>n||i==arr[i]-1||arr[i]<=0||arr[i]==arr[idx])i++;
            else swap(arr,idx,i);
        }
        for(int j =0;j<n;j++){
            if(j!=arr[j]-1) return j+1;
        }
        return n+1;
    }
}
