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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
            return dfs(root1, root2, target);
        }

        private boolean dfs(TreeNode root1, TreeNode root2, int target){
            if(root1 == null){
                return false;
            }

            TreeNode node = root2;
            while(node != null){
                if(node.val > target - root1.val){
                    node = node.left;
                }else if(node.val < target - root1.val){
                    node = node.right;
                }else{
                    return true;
                }
            }

            return dfs(root1.left, root2, target) || dfs(root1.right, root2, target);
        }
}