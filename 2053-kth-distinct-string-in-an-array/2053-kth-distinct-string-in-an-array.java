import java.util.*;
class Solution 
{
    public String kthDistinct(String[] arr, int k) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            String s = arr[i];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        String ans = "";
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(map.get(arr[i])==1){
                j++;
                if(j==k)
                {
                    ans = arr[i];
                    break;
                }
            }
                
        }
        return ans;
    }
}