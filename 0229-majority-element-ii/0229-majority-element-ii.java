import java.util.*;
class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int x = (nums.length)/3;
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
             if(count.containsKey(nums[i]))
            {
                count.put(nums[i], count.get(nums[i])+1);
            }
            else
            {
                count.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> j : count.entrySet())
        {
            if(j.getValue() > x)
                ans.add(j.getKey());
        }
        return ans;
    }
}