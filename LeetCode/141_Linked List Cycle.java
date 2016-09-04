/**
*Given a linked list, determine if it has a cycle in it.
*
*/

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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode ls = head;
        ListNode lq = head;
        while(ls!=null && ls.next!=null && lq!=null && lq.next!=null){
            ls = ls.next;
            lq = lq.next.next;
            if((ls == head)||(ls==lq)){
                return true;
            }
        }
        return false;
    }
}

