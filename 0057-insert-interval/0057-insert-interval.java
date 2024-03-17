class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        ArrayList<int[]> ans = new ArrayList<>();
        int i;
        int point;
        for(i = 0; i < intervals.length; i++)
        {
            if(intervals[i][1] < newInterval[0])
            {
                ans.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1])
                break;
            else
            {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        ans.add(newInterval);
        while (i < intervals.length)
        {
            ans.add(intervals[i++]);
        }
        int result[][] = new int[ans.size()][2];
        for(int j = 0; j < ans.size(); j++)
        {
            System.out.println(ans.get(j)[0]+" "+ans.get(j)[1]);
            result[j] = ans.get(j);
        }
        return result;
    }
}