class Solution {
    public int countSeniors(String[] d) 
    {           //61yrs
        int cnt = 0;
        for(int i = 0; i < d.length; i++)
        {
            int age = Integer.parseInt(d[i].substring(11,13));
            if(age>60)
                cnt++;
        }
        return cnt;
    }
}