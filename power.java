class Solution {
    public double myPow(double x, int n) {
        if(n>=0){
            if(n==0) return 1;
           double call =myPow(x,n/2);
           if(n%2==0) return call*call;
           else return x*call*call;
        }
        else{
            if (n==0) return 1;
            double call =myPow(x,n/2);
             if(n%2==0) return call*call;
           else return (1/x)*call*call;

        }
    }
}
