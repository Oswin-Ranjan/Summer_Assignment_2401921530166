class Solution {
    public int diagonalSum(int[][] mat) {
        int i,j,s=0,n=mat.length;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat.length;j++)
            {
                if((i==j) || (i+j==n-1))
                s+=mat[i][j];
                if((i==j) && (i+j==n-1))
                {
                s-=mat[i][j];
                s+=mat[i][j];
                }
            }
        }
        return s;
    }
}