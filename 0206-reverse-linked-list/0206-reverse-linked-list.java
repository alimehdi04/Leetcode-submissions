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
import java.util.*;
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        Stack<Integer> st = new Stack<>();
        ListNode newnode = new ListNode();
        ListNode curr = head;
        while(curr!=null)
        {
            st.push(curr.val);
            curr = curr.next;
        }
        ListNode temp = newnode;
        while(!st.isEmpty())
        {
            if(newnode==null)
            {
                newnode.val = st.pop();
            }
            else
            {
                ListNode xyz = new ListNode(st.pop());
                temp.next = xyz;
                temp = temp.next;
            }
        }
        return newnode.next;
    }
}