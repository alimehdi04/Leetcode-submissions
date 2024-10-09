class Solution {
    public String decodeString(String s) 
    {
        
        Stack<Integer> countStack = new Stack<>();
        Stack<String> alphabets = new Stack<>();
        String currS = "";
        int count = 0;
        
        for (char ch : s.toCharArray()) 
        {
            
            if (Character.isDigit(ch)) 
                count = count * 10 + (ch - '0');
            
            else if (ch == '[') 
            {
                countStack.push(count);
                alphabets.push(currS);
                currS = "";
                count = 0;
            } 
            else if (ch == ']') 
            {
                String headS = alphabets.pop();
                int repeatTimes = countStack.pop();
                String temp = "";
                
                for (int i = 0; i < repeatTimes; i++) 
                    temp += currS;
                
                currS = headS + temp;
            } 
            else
                currS += ch;
        }
        return currS;
    }
}