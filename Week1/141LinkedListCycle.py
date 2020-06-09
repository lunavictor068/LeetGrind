# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        pos = 0
        one = head
        two = head
        while True:
            if not(two and two.next):
                pos = -1
                return False
            one = one.next
            two = two.next.next
            pos += 1
            if one == two:
                return True
        return False