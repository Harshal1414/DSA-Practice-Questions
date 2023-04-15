public class LC_24_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        // Used Recursion
        if(head == null || head.next == null){
            return head;
        }
        ListNode ans = head.next;
        head.next = swapPairs(head.next.next);
        ans.next = head;
        return ans;
    }
}
