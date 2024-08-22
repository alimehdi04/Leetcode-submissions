class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        char last = num.charAt(n-1);
        if(isodd(last))
            return num;
        for(int i = n-1; i > 0; i--)
        {
            String s = num.substring(0, i);
            char c = s.charAt(s.length()-1);
            if(isodd(c))
                return s;
        }
        return "";
    }
    public boolean isodd(char c)
    {
            int n = (int) c;
            return (n%2!=0);
    }
}