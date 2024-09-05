class Solution 
{
    public int[] missingRolls(int[] rolls, int mean, int n) 
    {
        int totalsum = mean*(n + rolls.length);
        int currsum = 0;
        for(int i = 0; i < rolls.length; i++)
        {
            currsum += rolls[i];
        }
        int missingsum = totalsum - currsum;
        
        if(missingsum < n || missingsum > n*6)
        {
            return new int[0];
        }
        
        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            ans[i] = Math.min(6, missingsum - (n-i-1));
            missingsum -= ans[i];
        }
        return ans;
    }
}