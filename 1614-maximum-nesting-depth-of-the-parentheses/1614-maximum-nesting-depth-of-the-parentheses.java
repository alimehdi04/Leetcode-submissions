class Solution 
{
    public int maxDepth(String s) 
    {
        int maxn = 0, tempn = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                tempn++;
                maxn = Math.max(maxn, tempn);
            }
            else if(c == ')')
            {
                tempn--;
            }
        }
        return maxn;
    }
}