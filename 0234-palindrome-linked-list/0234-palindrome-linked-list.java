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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sechead = slow.next;
        sechead = reverse(sechead);
        ListNode i = head;
        ListNode j = sechead;
        while(i!=null&&j!=null)
        {
            if(i.val!=j.val)
                return false;
            i = i.next;
            j = j.next;
        }
        reverse(sechead);
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode newhead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
}