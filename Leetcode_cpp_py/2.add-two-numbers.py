#
# @lc app=leetcode id=2 lang=python3
#
# [2] Add Two Numbers
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


# 我自己写的辣鸡代码，链表操作，提交结果如下：
# √ Accepted
#   √ 1563/1563 cases passed (80 ms)
#   √ Your runtime beats 91.48 % of python3 submissions
#   √ Your memory usage beats 5.21 % of python3 submissions (13.1 MB)
# class Solution:
#     def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
#         root = n = ListNode(0)
#         carry = 0
#         while l1 and l2:
#             num = l1.val + l2.val + carry
#             if(num >= 10):
#                 n.next = ListNode(num % 10)
#             else:
#                 n.next = ListNode(num)
#             carry = num // 10
#             l1 = l1.next
#             l2 = l2.next
#             n = n.next
        
#         while l1 != None:
#             num = l1.val + carry
#             if(num >= 10):
#                 n.next = ListNode(num % 10)
#             else:
#                 n.next = ListNode(num)
#             carry = num // 10
#             l1 = l1.next
#             n = n.next

#         while l2 != None:
#             num = l2.val + carry
#             if(num >= 10):
#                 n.next = ListNode(num % 10)
#             else:
#                 n.next = ListNode(num)
#             carry = num // 10
#             l2 = l2.next
#             n = n.next

#         if carry != 0:
#             n.next = ListNode(carry)

#         return root.next


# 高票代码，值得学习
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        carry = 0
        root = n = ListNode(0)
        while l1 or l2 or carry:    #可以判断结点为None和数值为0
            v1 = v2 = 0             #记录两个链表当前值
            if l1:
                v1 = l1.val
                l1 = l1.next
            if l2:
                v2 = l2.val
                l2 = l2.next
            carry, val = divmod(v1+v2+carry, 10)    #Return the tuple (x//y, x%y). Invariant: div*y + mod == x.
            n.next = ListNode(val)  #增加一个结点
            n = n.next
        return root.next

