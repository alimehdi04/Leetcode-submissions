class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                stringStack.push(currentString);
                currentString = "";
                count = 0;
            } else if (ch == ']') {
                String decodedString = stringStack.pop();
                int repeatTimes = countStack.pop();
                String repeated = "";
                for (int i = 0; i < repeatTimes; i++) {
                    repeated += currentString;
                }
                currentString = decodedString + repeated;
            } else {
                currentString += ch;
            }
        }
        
        return currentString;
    }
}