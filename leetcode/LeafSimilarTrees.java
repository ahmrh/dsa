package leetcode;

import leetcode.classes.TreeNode;

public class LeafSimilarTrees {

  
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      
      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2 = new StringBuilder();

      getLeaves(root1, sb1);
      getLeaves(root2, sb2);

      String s1 = sb1.toString();
      String s2 = sb2.toString();

      return s1.equals(s2);
    }

    void getLeaves(TreeNode node, StringBuilder sb){
      if(node == null) return;
      if(node.left == null && node.right == null){
        sb.append(node.val + " ");
      }

      getLeaves(node.left, sb);
      getLeaves(node.right, sb);

    }
}
