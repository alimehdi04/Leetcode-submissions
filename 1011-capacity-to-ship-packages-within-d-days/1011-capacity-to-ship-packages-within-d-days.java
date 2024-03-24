class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
        int n = weights.length;
        int maxel = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            maxel = Math.max(weights[i], maxel);
        }
        int low = maxel, high = sum(weights);
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int nd = daysreq(weights, mid);
            if(nd <= days)
            {
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return low;
    }
    public int sum(int[] a)
    {
        int sum = 0;
        for(int i =0; i <a.length; i++)
            sum += a[i];
        
        return sum;
    }
    public int daysreq(int[] wt, int cap)
    {
        int load = 0;
        int days = 1;
        for(int i = 0; i<wt.length; i++)
        {
            if(load + wt[i] > cap)
            {
                days = days +1;
                load = wt[i];
            }
            else
                load += wt[i];
        }
        return days;
    }
}
/*

*/