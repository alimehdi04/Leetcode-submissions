class Solution 
{
    public void rotate(int[][] matrix) 
    {
        //transpose

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j= i; j < matrix.length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse row

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j= 0; j < matrix.length/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -j -1];
                matrix[i][matrix.length -j -1] = temp;
            }
        }
    }
}