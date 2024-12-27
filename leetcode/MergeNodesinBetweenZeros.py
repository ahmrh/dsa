# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        tempHead = ListNode(-1)

        mergedCurr = tempHead
        curr = head.next
        sum = 0

        while curr != None:
            if curr.val != 0:
                sum += curr.val
            else:
                mergedCurr.next = ListNode(sum)
                sum = 0
                mergedCurr = mergedCurr.next

            curr = curr.next
        
        return tempHead.next
    
    # def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:

    #     curr = head.next  
    #     prev = head 
    #     segment_sum = 0 
        
    #     while curr:
    #         if curr.val != 0:
    #             segment_sum += curr.val
    #         else:
    #             prev.next = ListNode(segment_sum)
    #             prev = prev.next
    #             segment_sum = 0 
            
    #         curr = curr.next 
        
    #     return head.next 