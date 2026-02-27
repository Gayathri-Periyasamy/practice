class Solution {
    public int diagonalSum(int[][] mat) {
        int isum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            isum=isum+mat[i][i];
            isum=isum+mat[i][n-1-i];
        }
        if((n%2)==1){
            n=n/2;
            isum=isum-mat[n][n];
        }
        return isum;
    }
}