/*
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

Note:
The relative order inside both the even and odd groups should remain as it was in the input. 
The first node is considered odd, the second node even and so on ...

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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode p = head;
        ListNode o = new ListNode(-1);
        ListNode j = new ListNode(-1);
        ListNode temp = j;
        ListNode ou = o;
        boolean flag = true;
        int i = 1;
        if(p.val %2 ==0){
            flag = false;
            i=0;
        }
        
        while(p!=null){
            if(i %2== 0){
                o.next = p;
                o = o.next;
            }else{
                j.next = p;
                j = j.next;
            }
            i++;
            p = p.next;
        }
        if(flag == false){
            temp = temp.next;
            o.next = temp;
            j.next = null;
            return ou.next;
        }
        o.next = null;
        ou = ou.next;
        j.next = ou;
        return temp.next;
    }
}
