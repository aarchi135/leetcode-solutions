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
    int maxDepth = 0;
    public void recursiveFun(TreeNode root,int depth) {
        if(root == null){
            maxDepth = Math.max(depth,maxDepth);
            return;
        }
        recursiveFun(root.left,depth+1);
        recursiveFun(root.right,depth+1);
    }
    public int maxDepth(TreeNode root){
        recursiveFun(root,0);
        return maxDepth;
    }

}
