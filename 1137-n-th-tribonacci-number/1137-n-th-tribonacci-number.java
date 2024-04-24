class Solution 
{
    public int tribonacci(int n) 
    {
       //0,1,1,2,4
       //0,1,2,3,4
        int i = 0, j = 1, k = 1;
        int c = 3;
        if(n==0)
            return i;
        else if(n==1||n==2)
            return 1;
        while(c<=n)
        {
            int t = i+j+k;
            i = j;
            j = k;
            k = t;
            c++;
        }
        return k;
    }
    
}

