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
    List<Integer> result = new ArrayList<Integer>();
    public void preorde(TreeNode root){
        if(root==null){
            return ;
        }
        preorde(root.left);
        result.add(root.val);
        preorde(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        preorde(root);
        return result;
    }
}