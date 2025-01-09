class Solution {
    private List<List<Integer>> result = new LinkedList<>();
    private Queue<Node> queue = new LinkedList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0 ; i < size ; i++) {
                Node node = queue.poll();
                list.add(node.val);
                for(Node children_node : node.children) {
                    queue.add(children_node);
                }
            }
            result.add(list);
        }
        return result;
    }
}
