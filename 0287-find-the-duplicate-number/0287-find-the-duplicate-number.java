class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        int store = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i]==store)
                return nums[i];
            else
                store = nums[i];
        }
        return store;
    }
}