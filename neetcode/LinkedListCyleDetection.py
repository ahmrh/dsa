# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        curr = head 

        arr = []

        while curr:
            if curr in arr:
                print("Index=%d" % arr.index(curr))
                return True
            else: 
                arr.append(curr)
                
            curr = curr.next
        
        return False
        