import java.util.*;
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c : t.toCharArray())
        {
            if((!map.containsKey(c))||count.getOrDefault(c,0)>=map.get(c))
                return false;
            count.put(c, count.getOrDefault(c,0)+1);
        }
        return true;
    }
}
//      