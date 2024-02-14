class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> rlist = new ArrayList<Integer>();
        ArrayList<Integer> clist = new ArrayList<Integer>();
        
        //marking
        for(int i = 0; i < m; i++)
        {
            for(int j=0; j < n; j++)
            {
                if(matrix[i][j]==0)
                {
                    rlist.add(i);
                    clist.add(j);
                }
            }
        }
        //setting
        for(Integer i : rlist)
        {
            for(int j=0; j < n; j++)
                matrix[i][j] = 0;
        }
        for(Integer i : clist)
        {
            for(int j=0; j < m; j++)
                matrix[j][i] = 0;
        }
        
    }
}
// ArrayList<Integer> list = new ArrayList<Integer>();
        //list.add(9);