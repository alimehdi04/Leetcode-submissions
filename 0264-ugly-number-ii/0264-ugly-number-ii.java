class Solution {
    public int nthUglyNumber(int n) 
    {
        int i2 = 1, i3 = 1, i5 = 1;
        int arr[] = new int[n+1];
        arr[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            int numi2 = arr[i2]*2;
            int numi3 = arr[i3]*3;
            int numi5 = arr[i5]*5;
            
            int min = Math.min(numi2, Math.min(numi3, numi5));
            
            arr[i] = min;
            
            if(min == numi2)
                i2++;
            if(min == numi3)
                i3++;
            if(min == numi5)
                i5++;
            
        }
        return arr[n];
    }
}