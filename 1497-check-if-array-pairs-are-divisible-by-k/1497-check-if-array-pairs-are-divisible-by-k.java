class Solution 
{
    public boolean canArrange(int[] arr, int k) 
    {
        int remfreq[] = new int[k];
        for(int num : arr)
        {
            int rem = ((num%k) + k) % k;
            remfreq[rem]++;
        }
        
        if((remfreq[0]%2) != 0) return false;
        
        for(int i = 1; i <= k/2; i++)
        {
            if(remfreq[i] != remfreq[k-i])
                return false;
        }
        return true;
    }
    
}