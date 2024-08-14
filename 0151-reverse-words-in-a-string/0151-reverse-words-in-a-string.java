class Solution 
{
    public String reverseWords(String s) 
    {
        s = s.trim();
        s += " ";
        Stack<String> st = new Stack<>();
        String temps = "";
        temps += s.charAt(0);
        for(int i = 1; i < s.length(); i++)
        {
            if(!Character.isWhitespace(s.charAt(i)))
                temps += s.charAt(i);
            if(Character.isWhitespace(s.charAt(i))&&!(Character.isWhitespace(s.charAt(i-1))))
            {
                //System.out.println(temps);
                st.add(temps+" ");
                temps = "";
            }
        }
        String ans = "";
        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            ans +=st.pop();
        }
        ans = ans.trim();
        return ans;
    }
}

//  S => abc xyz pqr
//  st => ""
//  temps += s[i]
//  if s[i] == " "
//  st.add(temps)
//  temps = 0
//  
//  st = abc, xyz, pqr <-
//
//  string ans = st.pop + " "
//  ans = pqr xyz abc
//
//
//