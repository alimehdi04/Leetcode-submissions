class Solution {
    public int maxProfit(int[] p) {
        int lmin = p[0];
        int maxp = 0;
        for(int i = 1; i < p.length; i++){
            int cost = p[i] - lmin;
            maxp = Math.max(maxp, cost);
            lmin = Math.min(lmin, p[i]);
        }
        return maxp;
    }
}