class Solution 
{
    public int[] arrayRankTransform(int[] arr) 
    {
        if (arr == null || arr.length == 0) return new int[0];
        
        int n = arr.length;
        int[][] indexedArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedArr[i] = new int[]{arr[i], i};
        }

        // Sort based on values
        Arrays.sort(indexedArr, (a, b) -> Integer.compare(a[0], b[0]));

        int[] result = new int[n];
        int rank = 1;

        result[indexedArr[0][1]] = rank;

        for (int i = 1; i < n; i++) {
            // If current element is different from previous, increase rank
            if (indexedArr[i][0] != indexedArr[i-1][0]) {
                rank++;
            }
            result[indexedArr[i][1]] = rank;
        }

        return result;
        
        
//         int[] sortedArr = Arrays.copyOf(arr, arr.length);
//         Arrays.sort(sortedArr);
        
//         HashMap<Integer, Integer> rank = new HashMap<>();
//         int rankcnt = 1;
        
//         for(int num : sortedArr)
//         {
//             if(!rank.containsKey(num))
//                 rank.put(num, rankcnt++);
//         }
        
//         int[] ans = new int[arr.length];
        
//         for(int i = 0; i < arr.length; i++)
//         {
//             ans[i] = rank.get(arr[i]);
//         }
        
//         return ans;
    }
}