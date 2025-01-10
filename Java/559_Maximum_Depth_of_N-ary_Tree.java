class Solution {
    private int result = 0;
    private Queue<Node> queue = new LinkedList<>();
    public int maxDepth(Node root) {
        if(root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                Node node = queue.poll();
                for(Node children_node : node.children) {
                    queue.add(children_node);
                }
            }
            result++;
        }
        return result;
    }
}
