class Solution 
{
    public int findKthPositive(int[] arr, int k) 
    {
        int p = 0, c = 1;
        int n =arr.length;
        for(int i = 1; i <= arr[n-1]&&p<n; i++)
        {
            if(i==arr[p])
                p++;
            else
            {
                if(k==c)
                    return i;
                System.out.println(i);
                c++;
            }
        }
        return (arr[n-1]+k-c+1);
    }
}