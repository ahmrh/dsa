# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.maxDiameter = 0
        
        self.diameterCountRecursion(root)

        return self.maxDiameter
    
    def diameterCountRecursion(self, node: Optional[TreeNode]) -> int:
        
        if node == None:  
            return 0
        
        leftDepth = self.diameterCountRecursion(node.left)
        rightDepth = self.diameterCountRecursion(node.right)


        diameter = leftDepth + rightDepth

        self.maxDiameter = max(self.maxDiameter, diameter)

        return max(leftDepth, rightDepth) + 1