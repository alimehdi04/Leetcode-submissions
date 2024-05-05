/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public void deleteNode(ListNode node) 
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
       /* if(head==null)
            return;
        Node currNode = head;
        while(currNode.next != null)
        {
            if(currNode.next == node)
            {
                currNode.next = (currNode.next).next;
                node.next = null;
            }
            currNode = currNode.next;
        }
        return node;
    }
    public void delete(Node head)
    {
        
    }*/
}