# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        tree = root 

        self.traverseInvert(root)

        return tree
    
    def traverseInvert(self, node: Optional[TreeNode]):
        if node == None: return 
        
        temp = node.left
        node.left = node.right
        node.right = temp

        self.invertTree(node.left)
        self.invertTree(node.right)


