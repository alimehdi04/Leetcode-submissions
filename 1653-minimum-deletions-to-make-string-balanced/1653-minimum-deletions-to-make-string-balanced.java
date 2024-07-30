class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        //int lbc[] = new int[n];
        int rac[] = new int[n];
        int min = Integer.MAX_VALUE;
        int tb = 0;
        int ta = 0;
        // for(int i = 0; i < n; i++)
        // {
        //     lbc[i] = tb;
        //     if(s.charAt(i)=='b')
        //         tb++;
        // }
        for(int i = n-1; i>=0; i--)
        {
            rac[i] = ta;
            if(s.charAt(i)=='a')
                ta++;
        }
        for(int i = 0; i < n; i++)
        {
            //lbc[i] = tb;
            if(min>(rac[i]+tb))
                min = (rac[i]+tb);
            if(s.charAt(i)=='b')
                tb++;
            
            
        }
        return min;
    }
}