class Solution {
    public int findComplement(int num) 
    {
        if (num == 0) return 1;
        StringBuilder bin = new StringBuilder();
        while(num>0)
        {
            int r = num%2;
            bin.insert(0,r);
            num = num/2;
        }
        for(int i = 0; i < bin.length(); i++)
        {
            if(bin.charAt(i)== '1')
                bin.setCharAt(i, '0');
            else
                bin.setCharAt(i, '1');
        }
        System.out.println(bin.toString());
        int decimal=Integer.parseInt(bin.toString(),2);
        return decimal;
    }
}