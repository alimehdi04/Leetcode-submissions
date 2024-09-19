/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int lA = 0, lB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            lA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lB++;
            tempB = tempB.next;
        }
        if(lA<lB)
        {
            return intersection(headA, headB, lB-lA);
        }
        else
        {
            return intersection(headB, headA, lA-lB);
        }
    }
    public ListNode intersection(ListNode A, ListNode B, int d)
    {
        ListNode tB = B;
        for(int i = 0; i < d; i++)
        {
            tB = tB.next;
        }
        while(A!=null && tB!=null)
        {
            if(A == tB)
                return A;
            A = A.next;
            tB = tB.next;
        }
        return null;
    }
}