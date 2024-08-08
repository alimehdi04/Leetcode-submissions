class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int steps = 1;
        int j = 0;
        int[][] ans = new int[rows * cols][2];
        
        ans[j][0] = rStart;
        ans[j][1] = cStart;
        j++;
        
        while (j < rows * cols) {
            for (int i = 0; i < 2; i++) {
                for (int k = 0; k < steps && j < rows * cols; k++) {
                    rStart += dir[d][0];
                    cStart += dir[d][1];
                    
                    if (0 <= rStart && rStart < rows && 0 <= cStart && cStart < cols) {
                        ans[j][0] = rStart;
                        ans[j][1] = cStart;
                        j++;
                    }
                }
                d = (d + 1) % 4;
            }
            steps++;
        }
        
        return ans;
    }
}