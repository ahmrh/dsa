# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
      
        return self.depthCountRecursion(root, 0)
    
    def depthCountRecursion(self, node: Optional[TreeNode], depth) -> int:
        
        if node == None:  
            return depth 
        
        leftDepth = self.depthCountRecursion(node.left, depth + 1)
        rightDepth = self.depthCountRecursion(node.right, depth + 1)
        
        return max(leftDepth, rightDepth)