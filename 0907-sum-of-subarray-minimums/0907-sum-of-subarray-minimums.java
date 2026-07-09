class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n  = arr.length;
        int []pse= new int[n];
        int []nse= new int[n];
        //pse store indices
        Stack<Integer> st = new Stack<>();
        int i =0;
        while(i<n){
            while(st.size()!=0&&arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.size()==0){
                pse[i]=-1;
                st.push(i);
            }
            else{
                pse[i]= st.peek();
                st.push(i);
            }

            i++;
        }
        //nse
        st.clear();
        for(int j =n-1;j>=0;j--){
            while(st.size()!=0&&arr[st.peek()]>arr[j]){
                st.pop();
            }
            if(st.size()==0){
                nse[j]=n;
                st.push(j);
            }
            else{
                nse[j]=st.peek();
                st.push(j);
            }
        }
        long sum=0;
        int mod =1000000007;
    for(int k=0;k<n;k++){
        sum=(sum+(long)arr[k]*(k-pse[k])*(nse[k]-k))%mod;
    }
    return (int)sum;
    }
}