class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int count  = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    count = count+mat[i][j];
                }else if(i+j==col-1){
                    count = count+mat[i][j];
                }
            }
        }
        return count;
        
    }
}