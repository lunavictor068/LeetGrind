# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode()
        current = dummy
        quotient = 0
        while l1 and l2:
            total = quotient + l1.val + l2.val
            quotient, remainder = divmod(total, 10)
            current.next = ListNode(remainder)
            current = current.next
            l1 = l1.next
            l2 = l2.next
        while l1:
            total = l1.val + quotient
            quotient, remainder = divmod(total, 10)
            current.next = ListNode(remainder)
            current = current.next
            l1 = l1.next
        while l2:
            total = l2.val + quotient
            quotient, remainder = divmod(total, 10)
            current.next = ListNode(remainder)
            current = current.next
            l2 = l2.next
        if quotient:
            current.next = ListNode(quotient)
        return dummy.next
            