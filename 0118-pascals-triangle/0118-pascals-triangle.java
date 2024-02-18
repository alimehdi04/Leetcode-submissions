class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
         List<List<Integer>> list = new ArrayList<>();
        
         for (int i = 0; i <= numRows; i++)
        {
            list.add(new ArrayList<>());
            int ele = 1;
            list.get(i).add(ele);
            for (int j = 1; j < i; j++)
            { 
                ele = ele * (i-j)/j;
                list.get(i).add(ele);
            }
             
        }
        list.remove(0);
        return list;
    }
}