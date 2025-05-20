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
    public TreeNode sortedArrayToBST(int[] arr) {
        
        return sortedArrayToBSTRecur(arr, 0, arr.length - 1);
    }

     TreeNode sortedArrayToBSTRecur(int[] arr, int start, int end) {
        if (start > end) return null;
    
        
        int mid = start + (end - start) / 2;
    
       
        TreeNode root = new TreeNode(arr[mid]);
    
       
        root.left = sortedArrayToBSTRecur(arr, start, mid - 1);
    
        
        root.right = sortedArrayToBSTRecur(arr, mid + 1, end);
    
        return root;
    }
 
}