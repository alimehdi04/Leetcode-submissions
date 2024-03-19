class Solution {
    public boolean search(int[] nums, int target) 
    {
         if(nums.length==1)
        {
            if(nums[0]==target)
                return true;
            else
                return false;
        }
        return bs(0, nums.length-1, nums, target);
    }
    public boolean bs(int low, int high, int[] nums, int target)
    {
        if(low>high)
            return false;
        int mid = low + (high-low)/2;
        
        if (nums[mid] == target)
                return true;
        
        if(nums[low]==nums[mid]&&nums[mid]==nums[high])
            return bs(low+1, high-1, nums, target);
        else if(nums[low]<=nums[mid])
        {
            if(nums[low]<=target&&target<=nums[mid])
                return bs(low, mid-1, nums, target);
            else
                return bs(mid+1, high, nums, target);
        }
        else /*if(nums[high]>=nums[mid])*/
        {
            if(nums[mid]<=target&&target<=nums[high])
                return bs(mid+1, high, nums, target);
            else
                return bs(low, mid-1, nums, target);
        }
    }
}