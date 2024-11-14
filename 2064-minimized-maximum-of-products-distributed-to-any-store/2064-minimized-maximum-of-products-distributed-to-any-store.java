class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int low = 1, high = Arrays.stream(q).max().getAsInt();
        while (low < high) {
            int mid = (low + high) / 2;
            if (canDistribute(q, n, mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private boolean canDistribute(int[] q, int n, int x) {
        int stores = 0;
        for (int qty : q) stores += (qty + x - 1) / x;
        return stores <= n;
    }
}