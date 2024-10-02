class Solution 
{
    public int[] arrayRankTransform(int[] arr) 
    {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> rank = new HashMap<>();
        int rankcnt = 1;
        for(int num : sortedArr)
        {
            if(!rank.containsKey(num))
                rank.put(num, rankcnt++);
        }
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            ans[i] = rank.get(arr[i]);
        }
        return ans;
    }
}