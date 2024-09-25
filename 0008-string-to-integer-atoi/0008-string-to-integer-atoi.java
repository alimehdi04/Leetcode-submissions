class Solution {
    public int myAtoi(String s) {
        int polarity = 1;
        int n = s.length();
        long result = 0; // Use long to handle overflow during calculation
        int sp = 0; //supervision
        
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c) && sp == 0) {
                continue;
            } else if (c == '-' && sp == 0) {
                polarity = -1;
                sp++;
            } else if (c == '+' && sp == 0) {
                sp++;
            } else if (Character.isDigit(c)) {
                result = result * 10 + (c - '0');
                sp++;
                // Check for overflow
                if (result > Integer.MAX_VALUE) {
                    return polarity == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }

        return (int) result * polarity;        
    }
}