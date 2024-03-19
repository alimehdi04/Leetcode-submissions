class Solution {
    public int findMin(int[] nums) 
    {
        return bs(0, nums.length-1, nums);
    }
    public int bs(int low, int high, int[] nums)
    {
        int ans = Integer.MAX_VALUE;
        while(low<=high)
        {
             int mid = low + (high-low)/2;
            if(nums[low]<=nums[high])
                return Math.min(ans, nums[low]);
            else if(nums[low]<=nums[mid])
            {
                ans = Math.min(ans, nums[low]);
                low = mid +1;
            }
            else
            {
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}