class Solution {
    public int minDays(int[] b, int m, int k) 
    {
        if(b.length < m*k)
            return -1;
         int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i=0; i<b.length; i++) {
            low = Math.min(low, b[i]);
            high = Math.max(high, b[i]);
        }

        //int low = min(b), high = max(b);
        int ans = -1;
        System.out.println(low +" "+ high);
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            System.out.println(mid);
             System.out.println(low +" "+ high);
            if(possible(b, mid, m, k))
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
                
        }
        return ans;
    }
    public boolean possible(int[] b, int day, int m, int k)
    {
        int cnt = 0, nb = 0;
        for(int i = 0; i < b.length; i++)
        {
            if(b[i]<=day)
                cnt++;
            else
            {
                //nb++;
                //nb += (cnt/k);
                cnt = 0;
            }
            
            if(cnt==k)
            {
                nb++;
                cnt = 0;
            }
        }
 	return nb >= m;    
	}
   /* public int min(int[] b)
    {
        Arrays.sort(b);
        return b[0];
    }
    public int max(int[] b)
    {
        Arrays.sort(b);
        return b[b.length -1];
    }*/
}