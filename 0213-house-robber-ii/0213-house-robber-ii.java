class Solution {
    public int rob(int[] nums) {
    if (nums.length == 1) return nums[0];
    return Math.max(
        robRange(nums, 0, nums.length - 2),  // Skip last house
        robRange(nums, 1, nums.length - 1)   // Skip first house
    );
}

private int robRange(int[] nums, int start, int end) {
    int prev2 = 0, prev1 = 0;
    
    for (int i = start; i <= end; i++) {
        int current = Math.max(prev1, prev2 + nums[i]);
        prev2 = prev1;
        prev1 = current;
    }
    
    return prev1;
}
    // public int dpSol(int a, int n, int[] nums, int[] dp)
    // {
    //     if(n == a) return nums[n];

    //     if(n == a+1)  return Math.max(nums[n], nums[n-1]);

    //     int left, right;

    //     if(dp[n] != -1) return dp[n];

    //     left = dpSol(a, n-1, nums, dp);
    //     right = Integer.MIN_VALUE;
    //     for(int i = 1; i+a <= n-1; i++)
    //     {
    //         int temp = dpSol(a, n-1-i, nums, dp) + nums[n];
    //         right = Math.max(temp, right);
    //     }
    //     dp[n] = Math.max(left, right);
    //     return dp[n];

    //     dp[0] = nums[0];
    //     dp[1] = Math.max(nums[0], nums[1]);

    //     for(int i = 2; i<= n; i++)
    //     {
    //         int right = nums[i] + dp[i-2];
    //         int left = dp[i-1];
    //         dp[i] = Math.max(left, right);
    //     }
    //     return dp[n];
    // }
}