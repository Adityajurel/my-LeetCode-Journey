class Solution {
    double pow(double a, int b){
        if(b==0) return 1;
        if(b==1) return a;
        if(b==-1) return 1/a;
        double ans=(pow(a,b/2));
        if(b>0){
            if(b%2==1) return a*ans*ans;
            else return (ans*ans);
        }
        else{
            if(b%2==-1) return (1/a)*(ans*ans);
            else return (ans*ans);
        }
        

    }
    public double myPow(double x, int n) {
     double fans= pow(x,n);
     return fans;

    }
}