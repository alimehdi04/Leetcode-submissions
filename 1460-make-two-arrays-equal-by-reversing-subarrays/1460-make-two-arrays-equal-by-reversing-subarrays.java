import java.util.*;
class Solution 
{
    public boolean canBeEqual(int[] target, int[] arr) 
    {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i=0;i<target.length;i++)
        {
            if(count.containsKey(target[i]))
            {
                count.put(target[i], count.get(target[i])+1);    //Frequency
            }
            else
            {
                count.put(target[i],1);
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            if(count.containsKey(arr[i]))
            {
                count.put(arr[i], count.get(arr[i])-1);    //Frequency
            }
        }
        for(Map.Entry<Integer, Integer> j : count.entrySet())
        {
            if(j.getValue()!=0)
                return false;
        }
        return true;
    }
}