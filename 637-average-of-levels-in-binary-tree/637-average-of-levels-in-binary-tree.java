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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double>a=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return a;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            double s=0.0;
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                s+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                    
                }
                if(node.right!=null){
                    q.add(node.right);
                    
                }
            }
            a.add(s/n);
        }
        return a;
        
    }
}