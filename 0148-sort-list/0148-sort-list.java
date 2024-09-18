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
class Solution {
    public ListNode sortList(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        head = mergesort(head);
        return head;
    }
    public ListNode mergesort(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode mid = Middle(head);
        ListNode lefthead = head;
        ListNode righthead = mid.next;
        mid.next = null;
        lefthead = mergesort(lefthead);
        righthead = mergesort(righthead);
        head = merge(lefthead, righthead);
        return head;
    }
    public ListNode merge(ListNode left, ListNode right)
    {
        if(left == null)    return right;
        if(right == null)   return left;
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        if(left.val <= right.val)
        {
            ans = temp = left;
            left = left.next;
        }
        else
        {
            ans = temp = right;
            right = right.next;
        }
        
        while(left != null && right != null)
        {
            if(left.val < right.val)
            {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
            else
            {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        temp.next = (left != null)? left : right;
        return ans;
    }
    public ListNode Middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}