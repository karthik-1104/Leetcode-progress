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

    private int targetValueX, targetValueY;
    private TreeNode parentX, parentY;
    private int depthX, depthY;
    
    public boolean isCousins(TreeNode root, int x, int y) {
         this.targetValueX = x;
        this.targetValueY = y;
        
        dfs(root, null, 0);
        
        return parentX != parentY && depthX == depthY;
    }

     private void dfs(TreeNode node, TreeNode parent, int depth) {
        if (node == null) {
            return;
        }
        if (node.val == targetValueX) {
            parentX = parent;
            depthX = depth;
        }
        if (node.val == targetValueY) {
            parentY = parent;
            depthY = depth;
        }
        
        dfs(node.left, node, depth + 1);
        dfs(node.right, node, depth + 1);
    }
}