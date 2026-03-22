class Solution {
    public int mySqrt(int x) {

        if(x==1||x==0) return x;
        long l=1;long h=x;
        while (l<=h){
          long  mid=(l+h)/2;
            if(mid*mid>x){
                h=mid-1;
            }
            else if(mid*mid<x){
                l=mid+1;
            }
            else return (int)mid;
        }
        return (int)h;
    }
}
