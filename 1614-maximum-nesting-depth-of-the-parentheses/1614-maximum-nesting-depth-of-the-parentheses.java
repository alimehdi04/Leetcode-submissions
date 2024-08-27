class Solution 
{
    public int maxDepth(String s) 
    {
        int maxn = 0, tempn = 0;
        int si = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                tempn++;
                si++;
            }
            else if(c == ')')
            {
                maxn = Math.max(maxn, tempn);
                tempn--;
                si--;
            }
        }
        return maxn;
    }
}