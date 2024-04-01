class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        String S = s.trim();
        int i = S.length() -1;
        int l =0;
        while(i>=0)
        {
            if(S.charAt(i)==' ')
                break;
            l++;
            i--;
        }
        return l;
    }
}