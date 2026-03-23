class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length;
        int col = matrix[0].length;
        int low=0;
        int high =row*col-1;
        while(low<=high){
            int  mid =low+(high-low)/2;
            int r = mid/col;
            int c = mid%col;
            int m = matrix[r][c];
            if(target ==m){
                 return true;
            }
            else if(target>m){
                low = mid+1;
            }
            else high = mid-1;
        }
        return false;
    }
}
