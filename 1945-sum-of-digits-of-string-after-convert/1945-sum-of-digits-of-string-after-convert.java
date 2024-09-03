class Solution {
    public int getLucky(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            int r = c - 'a' + 1;
            ans.append(r);
        }
        
        String ansStr = ans.toString();
        int sum = sumDigits(ansStr);
        
        for (int i = 1; i < k; i++) {
            sum = sumDigits(String.valueOf(sum));
        }
        
        return sum;
    }
    
    private int sumDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}