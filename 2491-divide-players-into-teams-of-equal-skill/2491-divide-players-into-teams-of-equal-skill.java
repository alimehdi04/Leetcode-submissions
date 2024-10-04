class Solution 
{
    public long dividePlayers(int[] skill) 
    {
        Arrays.sort(skill);
        int n = skill.length;
        int target = skill[0] + skill[n - 1];
        long chemistry = 0;
        
        for(int i = 0; i < n/2; i++)
        {
            if((skill[i]+skill[n-i-1])!=target)
                return -1;
            chemistry += (skill[i]*skill[n-1-i]);
        }
        return chemistry;
        
        //1,2,3,3,4,5
        // t = 6
    }
}