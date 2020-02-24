class Solution {
    public List<Integer> getRow(int rowIndex) {
         int[][] matrix = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    matrix[i][j] = 1;
                } else if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                }
            }
        }
        int[] lastRow = matrix[rowIndex];

        return Arrays.stream(lastRow).boxed().collect(Collectors.toList());
    }
}

//https://www.youtube.com/watch?v=WP6qUluheoc
