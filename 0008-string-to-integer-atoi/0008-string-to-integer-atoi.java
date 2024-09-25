class Solution 
{
    private int index;
    private int sign;
    private long result;
    private boolean numStarted;
    public int myAtoi(String s) 
    {
        index = 0;
        sign = 1;
        result = 0;
        numStarted = false;
        return recursiveAtoi(s);
    }
    public int recursiveAtoi(String s)
    {
        if(index >= s.length())
        {
            return (int)(sign*result);
        }
        char c = s.charAt(index);
        
        if(Character.isWhitespace(c)&&!numStarted)
        {
            index++;
            return recursiveAtoi(s);
        }
        
        if((c=='+'||c=='-')&&!numStarted)
        {
            sign = (c=='+')?1:-1;
            index++;
            numStarted = true;
            return recursiveAtoi(s);
        }
        
        if(Character.isDigit(c))
        {
            numStarted = true;
            result = result*10 + (c-'0');
            
            if(result>Integer.MAX_VALUE)
            {
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            index++;
            return recursiveAtoi(s);
        }
        return (int)(sign*result);
    }
}