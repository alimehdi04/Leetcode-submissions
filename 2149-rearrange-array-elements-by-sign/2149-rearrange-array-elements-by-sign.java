class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int n= nums.length;
        int psp=0, np=1;
        int ans[] = new int[n];
        for(int i=0; i<n; i++)
        {
            if(nums[i]>0)
            {
                ans[psp] = nums[i];
                psp += 2;
            }
            else if(nums[i]<0)
            {
                ans[np] = nums[i];
                np +=2;
            }
        }  
        return ans; 
    }
}