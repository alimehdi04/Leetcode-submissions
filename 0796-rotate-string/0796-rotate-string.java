class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
            return false;
        String combined = s.concat(s);
        for(int i = 0; i < s.length(); i++)
        {
            String temp = combined.substring(i, i+s.length());
            System.out.println(temp);
            if(temp.equals(goal))
                return true;
        }
        return false;
    }
}