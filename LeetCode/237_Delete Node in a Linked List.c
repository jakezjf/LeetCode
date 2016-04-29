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