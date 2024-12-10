# Definition for singly-linked list.
from typing import Optional
import math


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        self.gcdInsertionTraversal(head)
        return head
    
    def gcdInsertionTraversal(self, node: Optional[ListNode]):
        if node == None or node.next == None: 
            return
        
        node0 = node 
        node1 = node.next 

        insertedNode = ListNode()
        insertedNode.val = math.gcd(node0.val, node1.val)
        insertedNode.next = node1 
        node0.next = insertedNode

        self.gcdInsertionTraversal(node1)



        


        