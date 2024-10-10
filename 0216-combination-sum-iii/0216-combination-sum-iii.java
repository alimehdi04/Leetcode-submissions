class Solution 
{
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(k, n, 1, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int k, int rem, int i, List<List<Integer>> ans, List<Integer> sub)
    {
        if((sub.size() == k && rem != 0)||rem < 0) return;
        
        else if(sub.size() == k && rem == 0)
        {
            ans.add(new ArrayList<>(sub));
        }
        else
        {
            for(int j = i; j < 10; j++)
            {
                sub.add(j);
                backtrack(k, rem-j, j+1, ans, sub);
                sub.remove(sub.size() -1);
            }
        }
    }
}