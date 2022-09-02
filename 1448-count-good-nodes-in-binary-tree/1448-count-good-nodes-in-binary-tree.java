/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  
    public int count(TreeNode root,int d){
      if(root==null){
          return 0;
      }
        int c=0;
        if(root.val>=d){
            c=1;
            d=root.val;
        }
        return c+count(root.left,d)+count(root.right,d);
    
    }
    public int goodNodes(TreeNode root) {
         return count(root,root.val);
    }
}