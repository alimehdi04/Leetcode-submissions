class Solution 
{
    public int numTeams(int[] r) 
    {
        //ArrayList<Integer> a = new ArrayList<Integer>();
        int cnt = 0;
        for(int i = 0; i < r.length-2; i++)
        {
            for(int j = i+1; j < r.length-1; j++)
            {
                for(int k = j+1; k < r.length; k++)
                {
                    if((r[i]<r[j]&&r[j]<r[k])||(r[i]>r[j]&&r[j]>r[k]))
                    {
                        cnt++;
                        //System.out.println(r[i]+" "+r[j]+" "+r[k]);
                    }
                }
            }
        }
    return cnt;
    }
}