class Solution 
{
    private static int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) 
    {
        long even = n/2 + n%2;
        long odd = n/2;
        
        long ans = (pow(5, even)*pow(4,odd))%MOD;
        return (int)ans;
    }
    private static long pow(long x, long n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return x;
        
        long temp = pow(x, n/2);
        
        if(n%2==0)
        {
            return (temp*temp)%MOD;
        }
        else
        {
            return (x*temp*temp)%MOD;
        }
    }
}