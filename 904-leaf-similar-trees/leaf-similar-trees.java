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
     void level(TreeNode root,List<Integer>list){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        level(root.left,list);
        level(root.right,list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return true;
        }
         if(root1==null || root2==null){
            return false;
        }
        List<Integer>level1=new ArrayList<>();
                List<Integer>level2=new ArrayList<>();
                 level(root1,level1);
                  level(root2,level2);
                //     if(level1.size()!=level2.size())return false;
                //   for(int i=0;i<level1.size();i++){
                //     if(level1.get(i)!=level2.get(i)){
                //         return false;
                //     }
                //   }
             

       return level1.equals(level2);

    }
}