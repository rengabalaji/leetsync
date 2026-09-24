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
        Pre(root);
        return l;
    }
    void Pre(TreeNode root){
        if(root == null) return;
        l.add(root.val);
        Pre(root.left);
        Pre(root.right);
    }
}