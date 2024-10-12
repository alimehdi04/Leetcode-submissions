class Solution 
{
    public int minGroups(int[][] intv) 
    {
        int n = intv.length;
        if (n == 1) return 1;

        Arrays.sort(intv, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> end = new PriorityQueue<>();

        for (int[] group : intv) 
        {
            if (!end.isEmpty() && end.peek() < group[0]) 
            {
                end.poll();
            }
            end.offer(group[1]);
        }
        return end.size();
    }
}