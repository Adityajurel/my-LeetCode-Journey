class Solution {
    public int[][] transpose(int[][] arr) {
        int [][]mat= new int[arr[0].length][arr.length];
        for(int i = 0; i<arr[0].length;i++){
            for(int j = 0;j<arr.length;j++){
           mat[i][j]=arr[j][i];
        }
    }
    return mat;
    }
}
