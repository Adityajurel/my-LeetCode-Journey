class Solution {
    static int sqrt(long n){
        long l=1;
        long hi=n;
    
        if(n==1) return (int)n;
    while(l<=hi){
        long m=l+(hi-l)/2;
        if(m<(n/m)) l=m+1;
        else if(m==(n/m)) return (int)m;
        else{
            hi=m-1;
        } 
    }
    return (int)hi;
    }
    public int arrangeCoins(int n) {
       return (sqrt(1L+8L*n)-1)/2;
    }
}
