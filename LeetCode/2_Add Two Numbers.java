/**
*You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
*
*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
*Output: 7 -> 0 -> 8
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rhead = l1;
        ListNode list1 = l1;
        ListNode list2 = l2;
        if(list1.next==null && list2.next==null){
            list1.val = list1.val + list2.val;
            if(list1.val>=10){
                ListNode temp = new ListNode(0);
                list1.val = list1.val - 10;
                temp.next = null;
                temp.val = 1;
                list1.next = temp;
            }
            return rhead;
        }
        while(list1.next!=null && list2.next!=null){
            if((list1.val + list2.val)>=10){
                list1.next.val = list1.next.val + 1;
                list1.val = (list1.val + list2.val) - 10;
            }else{
                list1.val = list1.val + list2.val;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        list1.val = list1.val + list2.val;
        if(list2.next!=null){
            System.out.println(list2.val);
            list2 = list2.next; 
            list1.next = list2;
            if(list1.val>=10){
                list1.val = list1.val - 10;
                int t = 1;
                while(list2.next!=null){
                    list2.val = list2.val + t;
                    if(list2.val>=10){
                        list2.val = list2.val -10;
                        t = 1;
                    }else{
                        t = 0;
                    }
                    System.out.println(list2.val);
                    list2 = list2.next; 
                }
                list2.val = list2.val + t;
                if(list2.val >= 10){
                    ListNode temp = new ListNode(0);
                    list2.val = list2.val - 10;
                    temp.next = null;
                    temp.val = 1;
                    list2.next = temp;
                }
            }
            return rhead;
        }
        if(list1.next!=null){
            if(list1.val>=10){
                list1.val = list1.val - 10;
                int t = 1;
                list1 = list1.next;
                while(list1.next!=null){
                    list1.val = list1.val + t;
                    if(list1.val>=10){
                        list1.val = list1.val -10;
                        t = 1;
                    }else{
                        t = 0;
                    }
                    list1 = list1.next; 
                }
                list1.val = list1.val + t;
                if(list1.val>=10){
                    ListNode temp = new ListNode(0);
                    list1.val = list1.val - 10;
                    temp.next = null;
                    temp.val = 1;
                    list1.next = temp;
                }
            }
            return rhead;
        }
        if(list1.val>=10){
            ListNode temp = new ListNode(0);
            list1.val = list1.val - 10;
            temp.next = null;
            temp.val = 1;
            list1.next = temp;
        }
        return rhead;
    }
}
