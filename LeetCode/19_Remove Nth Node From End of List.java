/**
*Given a linked list, remove the nth node from the end of list and return its head.
*
*For example,
*
*   Given linked list: 1->2->3->4->5, and n = 2.
*
*   After removing the second node from the end, the linked list becomes 1->2->3->5.
*Note:
*Given n will always be valid.
*Try to do this in one pass.
*/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start,fast = start;
        slow.next = head;
        for(int i=0 ;i<n ;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
