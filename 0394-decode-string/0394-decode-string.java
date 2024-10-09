class Solution {
    public String decodeString(String s) 
    {
        
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> alphabets = new Stack<>();
        StringBuilder currS = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                alphabets.push(currS);
                currS = new StringBuilder();
                count = 0;
            } else if (ch == ']') {
                StringBuilder headS = alphabets.pop();
                int n = countStack.pop();
                StringBuilder temp = new StringBuilder();
                
                for (int i = 0; i < n; i++) {
                    temp.append(currS);
                }
                
                currS = headS.append(temp);
            } else {
                currS.append(ch);
            }
        }
        
        return currS.toString();
    }
}