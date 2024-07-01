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
         if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }
        if(head.next.next==null)
            return head.val == head.next.val;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode check = reverse(slow.next);
        ListNode i = check;
        ListNode j = head;
        while(j!=null&&i!=null)
        {
            if(j.val!=i.val)
            {
                reverse(check);
                return false;
            }
            j = j.next;
            i = i.next;
        }
        reverse(check);
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