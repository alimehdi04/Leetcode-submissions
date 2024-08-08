class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int high = mat[0].length -1;
        int low = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int row = colmax(mat, mid);
            int left = mid-1>=0?mat[row][mid-1]:-1;
            int right = mid+1<mat[0].length?mat[row][mid+1]:-1;
            
            if(mat[row][mid] > left && mat[row][mid] > right)
            {
                int ans[] = {row, mid};
                return ans;
            }
            else if(mat[row][mid] < left)   high = mid-1;
            else    low = mid+1;
        }
        int ans[] = {-1, -1};
        return ans;
    }
    public int colmax(int[][] a, int c)
    {
        int max = -1;
        int ind = -1;
        for(int i = 0; i < a.length; i++)
        {
            if(max<a[i][c])
            {    
                max = a[i][c];
                ind = i;
            }
        }
        return ind;
    }
}