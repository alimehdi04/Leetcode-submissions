class Solution {
    public boolean lemonadeChange(int[] bills) {
        //ArrayList<Integer, Integer> list = new ArrayLisr<>();
        int nof5 = 0, nof10 = 0, nof20 = 0;
        int i = 0;
        while(i<bills.length)
        {
            System.out.println(bills[i]+" "+nof5+" "+nof10);
            if(bills[i]==5)
                nof5++;
            else if(bills[i]==10)
            {
                nof10++;
                if(nof5>=1)
                {
                    nof5--;
                }
                else
                    return false;
            }
            else if(bills[i]==20)
            {
                nof20++;
                if((nof10>=1&&nof5>=1))
                {
                    nof10--;
                    nof5--;
                }
                else if((nof5>=3))
                    nof5 -= 3;
                else
                    return false;
            }
            i++;
        }
        return true;
    }
}
//     public boolean changepossible(int x, int a, int b)
//     {        
//         if(x==20&&((b>=1&&a>=1)||(a>=3)))
//         {
//             if((b>=1&&a>=1))
//             {
//                 b--;
//                 a--;
//             }
//             else if((a>=3))
//                 a--;
            
//             return true;
//         }
//         else if(x==10&&a>=1)
//         {
//             a--;
//             return true;
//         }
//         else if(x==5)
//             return true;
//         else
//             return false;
//     }
// 5,10,20,5
// 0,5,15,0
// 0,5,10,--
//0,5,10