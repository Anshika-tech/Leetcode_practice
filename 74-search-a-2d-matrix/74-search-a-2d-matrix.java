class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]>target){
                return false;
            }
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
                if(matrix[i][j]>target){
                    return  false;
                }
            }
        }
        return false;
    }
}