class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans= new ArrayList<>();
         int lc=0;int rc=arr[0].length-1;int fr= 0;int lr= arr.length-1;
        int count =0;
        int total =arr.length*arr[0].length;
        while(count<total){
        for(int i=lc;i<=rc;i++){
            ans.add(arr[fr][i]);
count++;
        }
        if(count==total) break;
        fr++;
        for(int i=fr;i<=lr;i++){
            ans.add(arr[i][rc]);
           count++;

          
        }
        if(count==total) break;

          rc--;
         for(int i=rc;i>=lc;i--){
            ans.add(arr[lr][i]);
       count++;

        }
        if(count==total) break;

            lr--;
         for(int i=lr;i>=fr;i--){
            ans.add(arr[i][lc]);
           count++;

        }

        lc++;

    }
    return ans;
    }
}
