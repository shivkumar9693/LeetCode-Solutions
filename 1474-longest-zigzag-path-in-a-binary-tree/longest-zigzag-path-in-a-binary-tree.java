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
    int  max=0;
    void dfs(TreeNode root,String dire,int len){
        if(root==null){
            return;
        }
        max=Math.max(max,len);
        if(dire.equals("LEFT")){
            dfs(root.right,"RIGHT",len+1);
            dfs(root.left,"LEFT",1);
        }
        if(dire.equals("RIGHT")){
            dfs(root.left,"LEFT",len+1);
            dfs(root.right,"RIGHT",1);
        }
    }
    public int longestZigZag(TreeNode root) {
         dfs(root.left,"LEFT",1);
         dfs(root.right,"RIGHT",1);
         return max;
    }
}