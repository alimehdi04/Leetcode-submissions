class Solution 
{
    public long maximumTotalSum(int[] maxht) 
    {
        long sum = 0;
        Arrays.sort(maxht);
        int curr = maxht[maxht.length - 1];
        
        for(int i = maxht.length - 1; i >= 0; i--)
        {
            if(maxht[i]<curr)
                curr = maxht[i];
            if(curr<=0)
                return -1;
            sum += curr;
            curr--;
        }
        return sum;
    }
}