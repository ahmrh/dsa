# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        return self.reverseRecursion(None, head)

    def reverseRecursion(self, prev: Optional[ListNode], node: Optional[ListNode]) -> Optional[ListNode]:
        if node == None: return prev
        
        next = node.next
        node.next = prev 

        return self.reverseRecursion(node, next)

    