/*
 * @lc app=leetcode id=2 lang=cpp
 *
 * [2] Add Two Numbers
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* root = new ListNode(0);
        ListNode* p = root;
        int carry, v1, v2, val;
        carry = v1 = v2 = 0;
        while (l1 || l2 || carry)
        {
            v1 = v2 = 0;
            if(l1){
                v1 = l1->val;
                l1 = l1->next;
            }
            if(l2){
                v2 = l2->val;
                l2 = l2->next;
            }
            val = (v1+v2+carry) % 10;
            carry = (v1+v2+carry) / 10;
            p->next = new ListNode(val);
            p = p->next;
        }
        return root->next;
    }
};

