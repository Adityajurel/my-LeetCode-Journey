class Solution {
    static int maxele(int[]arr){
        int max = arr[0];
        for(int  i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
     static int minele(int[]arr){
        int min = arr[0];
        for(int  i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static  int gcd1(int []arr){
        int min  = minele(arr);
        int max = maxele(arr);
        for(int i=min;i>=1;i--){
            if(max%i==0&&min%i==0) return i;
        }
        return 1;
    }
    public int findGCD(int[] nums) {
      return  gcd1(nums);
    }
}
