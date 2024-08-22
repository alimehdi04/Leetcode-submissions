class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        //smallest string
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++)
        {
            if(strs[i].length()<small)
                small = strs[i].length();
        }
        //
            if(small == 0)
            return "";
        String ans = strs[0].substring(0,small);
        
        for(int i = 1; i<strs.length; i++)
        {
            for(int j = 0; j < small; j++)
            {
                if(ans.charAt(j)!=strs[i].charAt(j))
                {
                    ans = strs[i].substring(0,j);
                    small = j;
                    break;
                }
            }
        }
        return ans;
    }
}