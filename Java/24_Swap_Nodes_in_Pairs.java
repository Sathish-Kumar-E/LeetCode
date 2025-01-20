class Solution {
    public ListNode swapPairs(ListNode head) {
        for(ListNode curr = head ; curr != null ; curr = curr.next.next) {
            if(curr.next == null) break;
            int temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;
        }
        return head;
    }
}
