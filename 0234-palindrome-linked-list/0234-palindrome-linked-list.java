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
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null&&head.next==null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null&&fast.next!=null)
        {
            fast = fast.next.next;
            //reversal
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        ListNode first = prev;
        ListNode second = null;
        if(fast == null)
            second = slow;
        else if(fast.next == null)
            second = slow.next;
        while(second!=null)
        {
            if(first.val!=second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    
}