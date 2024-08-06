import java.util.*;
class Solution 
{
    public int minimumPushes(String word) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int l = map.size();
        if(map.size() < 8)
            return word.length();
        int count = 0;
        int a[] = new int[l];
        int k = 0;
        for(Map.Entry<Character, Integer> j : map.entrySet())
        {
            // System.out.println(j.getKey()+" "+j.getValue());
            a[k] = j.getValue();
            k++;
        }
         Arrays.sort(a);
        reverse(a);
        //Collections.sort(sortedKeys);
        int cnt = 0;
        // int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            cnt++;
            if(cnt<=8)
                count += 1*a[i];
            else if(8<cnt&&cnt <= 16)
                count += 2*a[i];
            else if(16<cnt&&cnt <= 24)
                count += 3*a[i];
            else
                count += 4*a[i];
        }
        return count;
    }
     public static void reverse(int[] array)
    {
        // Length of the array
        int n = array.length;

        // Swapping the first half elements 
        // With last Half Elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half
              // to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half
            // to the first half
            array[n - i - 1] = temp;
        }
     }
}