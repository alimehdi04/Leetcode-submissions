import java.util.*;
class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray())
        {
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        
        List<Character> list = new ArrayList(freq.keySet());
        list.sort( (ob1, ob2) ->  freq.get(ob2) - freq.get(ob1));
        String ans = "";
        for(char c: list)
        {
            for(int i = 0; i < freq.get(c); i++)
                ans = ans + c;
        }
        return ans;
    }
}