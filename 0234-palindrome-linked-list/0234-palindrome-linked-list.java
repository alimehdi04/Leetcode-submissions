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
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode first = head;
        ListNode second = reverse(slow.next);
        while(second!=null)
        {
            if(second.val!=first.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        ListNode newhead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
}