/**
*Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
*For example,
*Given 1->2->3->3->4->4->5, return 1->2->5.
*Given 1->1->1->2->3, return 2->3.
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
        ListNode temp = new ListNode(0);
        ListNode slow = temp;
        slow.next = list;
        while(list != null) {
    	    while (list.next != null && list.val == list.next.val) {
     		    list = list.next;   
        	}
        	if (slow.next != list) { 
        		slow.next = list.next; 
    		    list = slow.next;    
    	    } else { 
        		slow = slow.next;
        		list = list.next;
    	    }
        }
        return temp.next;
    }
}
