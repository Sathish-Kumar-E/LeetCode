class Solution {
    private List<List<Integer>> result = new LinkedList<>();
    private Queue<TreeNode> queue = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0 ; i < size ; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
