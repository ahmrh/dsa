# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        curr1 = list1 
        curr2 = list2 

        head = ListNode(0) 
        curr = head

        while curr1 or curr2:
            if curr1 and curr2:
                if curr1.val < curr2.val:
                    curr.next = ListNode(curr1.val)
                    curr1 = curr1.next
                else:
                    curr.next = ListNode(curr2.val)
                    curr2 = curr2.next

            elif curr1:
                curr.next = ListNode(curr1.val)
                curr1 = curr1.next
            elif curr2:
                curr.next = ListNode(curr2.val)
                curr2 = curr2.next
              
                
        
        return head.next