/**
*Given a sorted linked list, delete all duplicates such that each element appear only once.
*For example,
*Given 1->1->2, return 1->2.
*Given 1->1->2->3->3, return 1->2->3.
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        if(list==null){
            return head;
        }
        while(list.next != null){
            if(list.val != list.next.val){
                list = list.next;
            }else{
                list.next = list.next.next;
            }
        }
        return head;
    }
}

