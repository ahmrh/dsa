package leetcode;

import leetcode.classes.TreeNode;

public class MaximumDepthofBinaryTree {
  
    public int maxDepth(TreeNode node) {
      if(node == null) return 0;

      return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
      
    }
}
