/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null&&fast.next!=null)
        {
                slow = slow.next;
                fast = fast.next.next;
            if(fast==slow)
                return true;

        }
        return false;
        
        // if(head!=null&&head.next!=null)
        // {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // while(slow!=fast&&slow!=null&&fast!=null&&slow.next!=null&&fast.next.next!=null)
        // {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // fast = head;
        // while(slow!=null&&fast!=null)
        // {
        //     slow = slow.next;
        //     fast = fast.next;
        //     if(slow==fast)
        //         return true;
        // }
        // }
        // return false;
        
    }
}