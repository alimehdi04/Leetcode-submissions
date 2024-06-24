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
    public ListNode middleNode(ListNode head) {
        int s = 0;
        ListNode curr = head;
        while(curr!=null)
        {
            s++;
            curr = curr.next;
        }
        s = (s/2);
        while(s>0)
        {
            s--;
            head = head.next;
        }
        return head;
    }
}