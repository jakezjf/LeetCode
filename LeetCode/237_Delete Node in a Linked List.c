/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    struct ListNode* node1;
    node1 = node->next;
    node->val = node1->val;
    node->next = node1->next;
    free(node1);
}
/**
 *Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    if(node->next==NULL){
        return;
    }
    node->val = node->next->val;
    node->next = node->next->next;
}
