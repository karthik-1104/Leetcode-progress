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
    public int deepestLeavesSum(TreeNode root) {
         int sum = 0;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            sum = 0; 
            for (int size = queue.size(); size > 0; --size) {
                TreeNode currentNode = queue.pollFirst();
                
                sum += currentNode.val;
               
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
               
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            
        }
        
        return sum;
    }
}