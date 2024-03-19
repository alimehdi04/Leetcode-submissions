class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] result = new int[2];
        if(nums.length==1&&target==nums[0])
        {
            result[0]= 0; result[1]=0;
            return result;
        }
        if(nums.length==2&&nums[0]==nums[1]&&nums[0]==target)
        {
            result[0]= 0; result[1]=1;
            return result;
        }    
        result[0] = lb(0, nums.length-1, nums, target);
        result[1] = ub(0, nums.length-1, nums, target);
        return result;
    }
    public int lb(int low, int high, int[] nums, int target)
    {
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(nums[mid]==target&&mid==0)
            return 0;
        else if(nums[mid]==target&&mid>0&&nums[mid-1]!=target)
            return mid;
        else if(nums[mid]>target||nums[mid]==target)
            return lb(low, mid-1, nums, target);
        return lb(mid+1, high, nums, target);
    }
    public int ub(int low, int high, int[] nums, int target)
    {
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(nums[mid]==target&&mid==nums.length-1)
            return mid;
        else if(nums[mid]==target&&mid<nums.length-1&&nums[mid+1]!=target)
            return mid;
        else if(nums[mid]<target||nums[mid]==target)
            return ub(mid+1, high, nums, target);
        return ub(low, mid-1, nums, target);
    }
}