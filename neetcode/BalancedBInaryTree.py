# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isBalanced(self, node: Optional[TreeNode]) -> bool:
        
        if node == None:
            return True
        
        heightLeft = self.heightBinaryTree(node.left)
        heightRight = self.heightBinaryTree(node.right)

        if abs(heightLeft - heightRight) > 1:
            return False
        
        return self.isBalanced(node.left) and self.isBalanced(node.right)
    


    def heightBinaryTree(self, node: Optional[TreeNode]) -> int:
        
        if node == None:
            return 0
        
        leftHeight = self.heightBinaryTree(node.left)

        rightHeight = self.heightBinaryTree(node.right)

        return max(leftHeight, rightHeight) + 1
    