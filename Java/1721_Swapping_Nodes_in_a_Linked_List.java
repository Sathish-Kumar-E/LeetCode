class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        for(ListNode curr = head ; curr != null ; curr = curr.next) {
            right = right.next;
            if(--k == 0) {
                left = curr;
                right = head;
            }
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}
