class Solution {

     public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        int [] nse= new int[n];
        Stack<Integer> st = new Stack<>();

        //pse
        
        for(int i =0;i<n;i++){
            while(st.size()!=0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                pse[i]=-1;
                st.push(i);
            }
            else {
                pse[i]=st.peek();
                st.push(i);
            }

        }

        st.clear();
        //nse 
        for(int i =n-1;i>=0;i--){
            while(st.size()!=0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                st.push(i);
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
                st.push(i);
            }
        }
        int ans=Integer.MIN_VALUE;


        for(int i =0;i<n;i++){
            int area =arr[i]*(nse[i]-pse[i]-1);
            ans=Math.max(area,ans);
        }
        return ans;
    }


    public int maximalRectangle(char[][] mat) {
        int r= mat.length;
        int c = mat[0].length;
        int[][] m = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                m[i][j]=mat[i][j]-'0';
            }
        }
        for(int  i=1;i<r;i++){
            for(int j = 0;j<c;j++){
                if(m[i][j]==1) m[i][j]+=m[i-1][j];
            }
        }
        int area =0;
        for(int[] row:m){
           int marea=largestRectangleArea(row);
           area= Math.max(area,marea);
        }
        return area;
    }
}