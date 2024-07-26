class Solution {
    public int singleNonDuplicate(int[] a) 
    {
        int low =0;
        int high = a.length-1;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(mid%2==0)//even
            {
                if(a[mid+1]==a[mid])
                {
                    low = mid+2;
                }
                else
                    high = mid;
            }
            else//odd
            {
                if(a[mid-1]==a[mid])
                    low = mid+1;
                else
                    high = mid-1;
            }
                
        }
        return a[low];
    }
}