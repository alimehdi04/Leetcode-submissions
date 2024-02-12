import java.util.*;
class Solution 
{
    public List<Integer> spiralOrder(int[][] mat) 
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int m = mat.length, n = mat[0].length;
        int top=0, left=0, bottom = m-1, right = n-1;
        int t = m*n;
        int c = 0;
        while(c<t && top<=bottom && left<=right)
        {
            for(int i = left; i <= right && c<t; i++)
            {
                ans.add(mat[top][i]);
                c++;
            }
            top++;
            for(int j = top; j <= bottom && c<t; j++)
            {
                ans.add(mat[j][right]);
                c++;
            }
            right--;
            for(int k = right; k >= left && c<t; k--)
            {
                 ans.add(mat[bottom][k]);
                c++;
            }
            bottom--;
            for(int l = bottom; l >= top && c<t; l--)
            {
                 ans.add(mat[l][left]);
                c++;
            }
            left++;
        }
        return ans;
    }
}