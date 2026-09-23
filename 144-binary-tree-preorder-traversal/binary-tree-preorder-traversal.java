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
    List<Integer> l = new LinkedList<>();

    
    public List<Integer> preorderTraversal(TreeNode root) {
        PreOrder(root);
        return l;
        
    }
    void PreOrder(TreeNode root){
        if(root==null)return ;
        l.add(root.val);
        PreOrder(root.left);
        PreOrder(root.right);

    }
}