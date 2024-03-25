class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++)//(i)
        {
            if(nums[i]==nums[i-1])
                list.add(nums[i]);
        }
        return list;
    }
}