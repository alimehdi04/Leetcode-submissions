class Solution {
    public int findDuplicate(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            int ind = Math.abs(a[i]);
            if(a[ind]<0)
                return Math.abs(a[i]);
            a[ind] = -a[ind];
        }
        return 0;
    }
}