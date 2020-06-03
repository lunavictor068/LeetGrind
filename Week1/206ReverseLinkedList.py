# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(self, head: ListNode) -> ListNode:
    previous = Nonew
    current = head
    local_next = head.next
    while local_next:
        current.next = previous
        previous = current
        current = local_next
        local_next = local_next.next
    return current