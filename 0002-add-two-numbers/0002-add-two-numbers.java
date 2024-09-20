/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        if(l1 == null)
            return l2;
        
        if(l2 == null)
            return l1;
        
        ListNode i1 = l1;
        ListNode i2 = l2;
        
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int c = 0;
        
        while(i1 != null || i2 != null || c!=0)
        {
            int x = (i1 != null) ? i1.val : 0;
            int y = (i2 != null) ? i2.val : 0;
            
            int s = x+y+c;
            c = s/10;
            temp.next = new ListNode(s%10);
            temp = temp.next;
            
            // temp.val = temp.val + x + y;
            // c =temp.val / 10;
            // temp.val = temp.val % 10;
            // ListNode newnode = new ListNode(c);
            // temp.next = newnode;
            // temp = temp.next;
            if(i1!= null)   i1 = i1.next;
            if(i2!= null)   i2 = i2.next;
        }
        return ans.next;
    }
}