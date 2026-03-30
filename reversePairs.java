class Solution {
    static int count;
      static void ms(int[]arr){
        int n = arr.length;
        if(n==1) return;
        int []a =  new int[n/2];
        int[]b = new int[n-n/2];
        int  idx=0;
        for(int  i=0;i<a.length;i++) a[i]= arr[idx++];
        for(int  j=0;j<b.length;j++)  b[j]= arr[idx++];
        ms(a);
        ms(b);
        countInv(a,b);
        merge(a,b,arr);
    }
       static void countInv(int[]a,int []b){
        int i =0;int j =0;
        while(i<a.length&&j<b.length){
            if((long)a[i]>2L*b[j]){
                count+=a.length-i;
                j++;
            }
            else{
                i++;
            }
        }
    }
     static void merge(int[]a,int []b ,int[]c){
        int i=0;int j =0;int k =0; int count=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]) c[k++]= a[i++];
            else{ c[k++]=b[j++];
            }
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public int reversePairs(int[] nums) {
        count=0;
    ms(nums);
    return count;
    }
}
