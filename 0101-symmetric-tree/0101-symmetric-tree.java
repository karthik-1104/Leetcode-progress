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
    public boolean isSymmetric(TreeNode root) {
         if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode leftSub, TreeNode rightSub) {

        if (leftSub == null && rightSub == null) {
            return true;
        }

       
        if (leftSub == null || rightSub == null) {
            return false;
        }

        return (leftSub.val == rightSub.val) &&
               isMirror(leftSub.left, rightSub.right) &&
               isMirror(leftSub.right, rightSub.left);
    }
}