class Solution 
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] arr, int rem, int start, List<List<Integer>> ans, List<Integer> sub)
    {
        if(rem < 0) return;
        
        else if(rem == 0)
            ans.add(new ArrayList<>(sub));
        else
        {
            for(int i = start; i < arr.length && arr[i] <= rem; i++)
            {
                if(i > start && arr[i] == arr[i-1]) continue;
                
                sub.add(arr[i]);
                backtrack(arr, rem-arr[i], i+1, ans, sub);
                sub.remove(sub.size() - 1);
            }
        }
    }
}