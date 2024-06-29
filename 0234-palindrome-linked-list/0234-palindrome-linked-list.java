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
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> str = new Stack<Integer>();
        ListNode newhead = head;
        while(newhead!=null)
        {
            str.add(newhead.val);
            newhead = newhead.next;
        }
        System.out.println(str);
        newhead = head;
        while(!str.isEmpty())
        {
            
            // Integer s = str.pop();
            // int r = s.intValue();
            // Integer con = new Integer(newhead.val);
            
            if(str.pop() != newhead.val)
                return false;
            
            newhead = newhead.next;
            // str.pop();
        }
        return true;
    }
}