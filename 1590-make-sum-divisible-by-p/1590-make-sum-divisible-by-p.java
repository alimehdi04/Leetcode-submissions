class Solution 
{
    public int minSubarray(int[] nums, int p) 
    {
        long tsum = 0;
        for (int num : nums) {
            tsum += num;
        }
        
        int target = (int)(tsum % p);
        
        if (target == 0) {
            return 0;
        }
        
        Map<Integer, Integer> psum = new HashMap<>();
        psum.put(0, -1);
        int sum = 0;
        int minlen = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % p;
            int complement = (sum - target + p) % p;
            
            if (psum.containsKey(complement)) {
                minlen = Math.min(minlen, i - psum.get(complement));
            }
            
            psum.put(sum, i);
        }
        
        return (minlen < nums.length) ? minlen : -1;

    }
}