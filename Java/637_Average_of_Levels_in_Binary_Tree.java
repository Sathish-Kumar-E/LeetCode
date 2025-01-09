class Solution {
    private List<Double> result = new LinkedList<>();
    private Queue<TreeNode> queue = new LinkedList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null)
            return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double level_sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level_sum += node.val;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add((Double) level_sum / size);
        }
        return result;
    }
}
