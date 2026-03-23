class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
     int high =n-1;
     int low  = 0;
     while(low<=high){
        int mid = low+(high-low)/2;
        int crIdx= arr[mid]-1;
        int missing = crIdx - mid;
        if(k>missing) low = mid+1;
        else high = mid-1;
     }
          return low+k;  
        }
    }
