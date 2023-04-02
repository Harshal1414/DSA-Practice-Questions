public class LC_203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr != null && curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}


else{
    curr = curr.next;
}