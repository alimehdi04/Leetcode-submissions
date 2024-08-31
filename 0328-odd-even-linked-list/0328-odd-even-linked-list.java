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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null || head.next == null || head.next.next == null)
            return head;
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        
        ListNode i = head;
        int j = 0;
        while(i!=null)
        {
            if(j%2==0)
                odd.push(i.val);
            else
                even.push(i.val);
            
            j++;
            i = i.next;
        }
        
        ListNode newhead = new ListNode((int)even.pop());
        while(!even.isEmpty())
        {
            ListNode node = new ListNode((int)even.pop());
            node.next = newhead;
            newhead = node;
        }
        while(!odd.isEmpty())
        {
            ListNode node = new ListNode((int)odd.pop());
            node.next = newhead;
            newhead = node;
        }
        return newhead;
    }
}