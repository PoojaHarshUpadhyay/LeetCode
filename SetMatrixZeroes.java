class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length < 0) {
            return;
        }
        char[] rowMat = new char[matrix.length];
        char[] colMat = new char[matrix[0].length];

        for(int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col] == 0) {
                    rowMat[row] = 'x';
                    colMat[col] = 'x';
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(rowMat[i] == 'x' || colMat[j] == 'x') {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
