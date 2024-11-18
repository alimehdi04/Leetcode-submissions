class Solution 
{
    public int[] decrypt(int[] code, int k) 
    {
        if(k == 0)
        {
            Arrays.fill(code, 0);
            return code;
        }
        int n = code.length;
        int sum[] = new int[n];
        
        if(k > 0)
        {
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < k; j++)
                {
                    sum[i] += code[(i+1+j)%n];
                }
            }   
        }
        else if(k < 0)
        {
            k = -k;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < k; j++)
                {
                    sum[i] += code[(i-1-j+n)%n];
                }
            }
        }
        return sum;
       
    }
}