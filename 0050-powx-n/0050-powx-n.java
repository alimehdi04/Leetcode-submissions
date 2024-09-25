class Solution 
{
    public double myPow(double x, int n) 
    {
        long dn = n;
        double ans = 1.0;
        if(dn<0)
            dn = -1*dn;
        while(dn>0)
        {
            if(dn%2==1)
            {
                ans*=x;
                dn--;
            }
            else
            {
                x*=x;
                dn/=2;
            }
        }
        if(n<0)
            ans = (double)(1.0)/ans;
        return ans;
    }
}