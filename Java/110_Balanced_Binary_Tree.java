class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(!isBalanced(root.left) || !isBalanced(root.right)) return false;
        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return true;
    }
    public int height(TreeNode node) {
        if(node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
