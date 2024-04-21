class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (int) Math.ceil((double) n / 2); i++) {
            for (int j = 0; j < n / 2; j++) {
                int r1 = j, c1 = n - i - 1;
                swap(matrix, r1, c1, i, j);

                int r2 = c1, c2 = n - 1 - r1;
                swap(matrix, r2, c2, i, j);

                int r3 = c2, c3 = n - 1 - r2;
                swap(matrix, r3, c3, i, j);
            }
        }
    }

    private void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}