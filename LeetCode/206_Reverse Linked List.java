/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode n = new ListNode(0);
        ListNode p = null;
        while(head !=null){
            p = head;
            head = head.next;
            p.next = n.next;
            n.next = p;
        }
        return n.next;
    }
}
