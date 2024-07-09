package leetcode;

import leetcode.classes.TreeNode;

public class SearchinaBinarySearchTree {
  
  public TreeNode searchBST(TreeNode root, int val) {
    if(root == null) return null;

    if(root.val < val) return searchBST(root.left, val);
    else if(root.val > val) return searchBST(root.right, val);
    else return root;
  }
}
