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
   

     List<Integer> levelTraversal(TreeNode root,int level, List<Integer> temp){
        
        if(root!=null){
        if(level==0){
            temp.add(root.val);
        }
        levelTraversal(root.left,level-1,temp);
        levelTraversal(root.right,level-1,temp);
        }

        return temp;
     }

    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);

        return Math.max(l,r)+1;
    }
     public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> l=new ArrayList<>();
        int height=height(root);
         for(int level=0;level<height;level++){
            List<Integer> temp=new ArrayList<>();
            temp=levelTraversal(root,level,temp);
            l.add(temp);
        }

        return l;
    }
}