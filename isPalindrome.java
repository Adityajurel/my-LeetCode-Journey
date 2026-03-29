class Solution {
    static int rev(int n,int a){
    while(n!=0){
        a*=10;
        a+=n%10;
        n/=10;
    }
    return a;
}
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else return rev(x,0)==x;
    }
}
