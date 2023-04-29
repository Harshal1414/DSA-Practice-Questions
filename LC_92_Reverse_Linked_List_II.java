public class LC_92_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;

        for(int i = 0; i < left - 1; i++){
            pre = pre.next;
        }

        ListNode prev = pre.next;
        ListNode curr = prev.next;

        for(int i = 0; i < right - left; i++){
            ListNode nextNode = curr.next;
            curr.next = prev;

            // Update
            prev = curr;
            curr = nextNode;
        }
        pre.next.next = curr;
        pre.next = prev;

        return dummy.next;
    }
}
