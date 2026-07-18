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
    int helper(TreeNode root, long targetSum){
          if(root==null){
            return 0;
        }
        int count=0;
        if(root.val==targetSum){
            count=1;
           
        }
        return count+helper(root.left,targetSum-root.val)+ helper(root.right,targetSum-root.val);
    }
    int outerLoop(TreeNode node,int target){
        if(node==null){
            return 0;
        }
        return helper(node,(long)target)+
        outerLoop(node.left,target)+outerLoop(node.right,target);
    }
    public int pathSum(TreeNode root, int targetSum) {
      return outerLoop(root,targetSum);
    }
}