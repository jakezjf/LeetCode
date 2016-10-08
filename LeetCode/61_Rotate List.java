/**
*Given a list, rotate the list to the right by k places, where k is non-negative.
*
*For example:
*Given 1->2->3->4->5->NULL and k = 2,
*return 4->5->1->2->3->NULL.
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0 ){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1;i <= k ;i++ ){
            fast = fast.next;
            if(fast == null){
                fast = head;
                k=k%i;
                i=0;
            }
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        ListNode newList = slow.next;
        slow.next = null;
        return newList;
    }
}
