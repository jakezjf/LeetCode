/**
*Given a linked list, swap every two adjacent nodes and return its head.
*For example,
*Given 1->2->3->4, you should return the list as 2->1->4->3.
*Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*
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
    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode l = ans;
        while(l.next!=null && l.next.next!=null){
            ListNode temp = l.next;
            ListNode temp1 = l.next.next;
            temp.next = temp1.next;
            l.next = temp1;
            l.next.next = temp;
            l = l.next.next;
        }
        return ans.next;
    }
}
