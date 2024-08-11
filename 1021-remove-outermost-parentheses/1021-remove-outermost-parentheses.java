class Solution {
    public String removeOuterParentheses(String s) 
    {  
        int cnt = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                if(cnt == 0){
                    cnt++;
                }
                else{
                    cnt++;
                    ans +=s.charAt(i);
                }
            }
            else
            {
                cnt--;
                if(cnt!=0)
                    ans +=s.charAt(i);
            }
        }
        return ans;
    }
}