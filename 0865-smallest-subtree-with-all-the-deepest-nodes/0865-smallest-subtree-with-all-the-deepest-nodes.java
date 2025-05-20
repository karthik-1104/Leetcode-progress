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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return deepSubtreeDfs(root).getKey();
    }

    private Pair<TreeNode, Integer> deepSubtreeDfs(TreeNode node) {
    
        if (node == null) {
            return new Pair<>(null, 0);
        }
      
        
        Pair<TreeNode, Integer> leftPair = deepSubtreeDfs(node.left);
       
        Pair<TreeNode, Integer> rightPair = deepSubtreeDfs(node.right);
      
        
        int leftDepth = leftPair.getValue();
        
        int rightDepth = rightPair.getValue();

        
        if (leftDepth > rightDepth) {
            return new Pair<>(leftPair.getKey(), leftDepth + 1);
        }
      
        if (leftDepth < rightDepth) {
            return new Pair<>(rightPair.getKey(), rightDepth + 1);
        }
      
        // If both subtrees have the same depth, the current node is the LCA of the deepest nodes, 
        // so return the current node and the depth increased by one.
        return new Pair<>(node, leftDepth + 1);
    }
}