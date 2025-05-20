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

    int maxDiameter=0;
    
    public int maxleftLen = 0,maxrightLen=0,len=0,leftLlen=0,rightLen=0;
    public int diameterOfBinaryTree(TreeNode root) {
         maxDiameter = 0;
        depthFirstSearch(root);
        return maxDiameter;
    
    }
    private int depthFirstSearch(TreeNode node) {
        if (node == null) {
             return 0;
        }
        
        int leftHeight = depthFirstSearch(node.left);
        int rightHeight = depthFirstSearch(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

}