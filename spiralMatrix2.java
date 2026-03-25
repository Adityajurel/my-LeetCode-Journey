class Solution {
    public int[][] generateMatrix(int n) {
        int [][]arr = new int[n][n];
 int lc=0;int rc=n-1;int fr= 0;int lr= n-1;
        int count =1;
        int total =n*n;
        while(count<=total){
     
        for(int i=lc;i<=rc;i++){
            arr[fr][i] =count;
count++;
        }
        if(count==total) break;
        fr++;
        for(int i=fr;i<=lr;i++){
            arr[i][rc]=count;
           count++;

          
        }
        

          rc--;
         for(int i=rc;i>=lc;i--){
            arr[lr][i]=count;
       count++;

        }
     

            lr--;
         for(int i=lr;i>=fr;i--){
            arr[i][lc]=count;
           count++;

        }

        lc++;

    }
    return arr;
    }
}
