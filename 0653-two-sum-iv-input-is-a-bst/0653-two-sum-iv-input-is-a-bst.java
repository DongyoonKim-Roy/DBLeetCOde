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
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> leftNodes = new Stack<TreeNode>();
        Stack<TreeNode> rightNodes = new Stack<TreeNode>();

        for(TreeNode curr = root; curr != null; curr = curr.left)
            leftNodes.push(curr);
        
        for(TreeNode curr = root; curr != null; curr = curr.right)
            rightNodes.push(curr);

        while(leftNodes.size() != 0 && rightNodes.size() != 0 && leftNodes.peek() != rightNodes.peek()){
            int sum = leftNodes.peek().val + rightNodes.peek().val;
            
            if(sum < k)
                for(TreeNode curr = leftNodes.pop().right; curr != null; curr = curr.left)
                    leftNodes.push(curr);
            else if(sum > k)
                for(TreeNode curr = rightNodes.pop().left; curr != null; curr = curr.right)
                    rightNodes.push(curr);
            else
                return true;
        }
        
        return false;
    }
}
